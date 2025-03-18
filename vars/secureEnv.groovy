// vars/secureEnv.groovy
def call() {
    return [
        JENKINS_JOB_NAME             : "v267",
        GIT_HUB_ACCOUNT_OWNER        : 'riteshd2',
        GIT_HUB_REPO_OWNER           : 'simplecrm-projects',
        GIT_HUB_REPO_NAME            : 'simplecrm_v267',
        GIT_HUB_URL                  : "https://github.com/simplecrm-projects/simplecrm_v267.git",
        TARGET_BRANCH                : "dev",
        JENKINS_GLOBAL_CREDENTIAL_TOKEN : 'Implementataion-ID-Token1',
        REMOTE_SERVER_CREDENTIAL     : 'Remote-Server-Demo',
        REMOTE_SERVER                : 'shubhamb@172.22.7.71',
        REMOTE_PORT                  : "58689",
        REMOTE_PATH                  : '/application/product/code/v267/'
    ]
}

