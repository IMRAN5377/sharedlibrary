def newGit(repo)
{
  git"${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def deploy(jobname,ip,context)
{
  def run selinium(jobname)
  {
    sh "scp|war|lib|workspace/${jobname}/webapp/target/webapp.war ubuntu@ ${ip} |var|lib|tomcat9|webapp/{${context}."war"
  }
