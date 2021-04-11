# springboot-openshift

This is a simple Spring Boot application. Application is deployed on OpenShift(minishift) for demo purpose.
> Minishift is a tool that helps you run OpenShift locally by running a single-node OpenShift cluster inside a VM. You can try out OpenShift or develop with it, day-to-day, on your localhost.

## 1. Install virtual box
* [Virtualbox Download](https://www.virtualbox.org/wiki/Downloads)

## 2. Set up your virtualization environment
    brew install docker-machine-driver-xhyve
    sudo chown root:wheel /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
    sudo chmod u+s /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve

## 3. Install Minishift
    # brew install homebrew/cask/brew-cask
    # brew tap homebrew/cask-versions
    brew install minishift
    #brew install --force minishift

## 4. Start Minishift
    minishift config set vm-driver virtualbox
    minishift start
    # minishift start --vm-driver=virtualbox
    # minishift stop
    minishift ip
    minishift oc-env

    oc login -u system:admin
    oc login -u developer
    https://<ip>:8443/console/catalog

    minishift addons install --defaults
    oc adm policy --as system:admin add-cluster-role-to-user cluster-admin developer

    oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/shibaevv/springboot-openshift.git — name=springboot

## 5 
    mvn clean install k8s:build k8s:resource k8s:apply
    mvn clean install oc:build oc:resource oc:apply

# References
* [Eclipse jJKube](https://github.com/eclipse/jkube)
* [OpenShift Maven Plugin](https://github.com/eclipse/jkube/tree/master/openshift-maven-plugin)
* [how-to-setup-openshift-locally-on-mac-os](https://medium.com/swlh/how-to-setup-openshift-locally-on-mac-os-a3b7eb5a5151)
* [setting-up-virtualization-environment](https://docs.okd.io/3.11/minishift/getting-started/setting-up-virtualization-environment.html#setting-up-virtualbox-driver)
* [spring-boot-deploy-openshift](https://www.baeldung.com/spring-boot-deploy-openshift)
* [spring-cloud-kubernetes](https://github.com/spring-cloud/spring-cloud-kubernetes)
* [Online Spring Boot Banner Generator](https://devops.datenkollektiv.de/banner.txt/index.html)
