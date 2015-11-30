# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

  config.vm.box = "ubuntu/trusty64"
  config.vm.box_url = "https://vagrantcloud.com/ubuntu/trusty64"
  config.vm.provider "virtualbox" do |vb|
        vb.memory = "1024" 
  end      
  config.vm.provision :ansible, playbook: "playbook.yml"

  #configure cloud node
  config.vm.define "cloud" do |cloud|
     cloud.vm.hostname = "cloud"
     cloud.vm.network :private_network, ip: "10.0.5.10"
  end


  #config.vm.network "forwarded_port", guest: 8080, host: 8080
  #config.vm.network "forwarded_port", guest: 8081, host: 8081
  
end
