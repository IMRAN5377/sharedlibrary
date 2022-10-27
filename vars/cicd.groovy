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
    sh "java -jar var/lib/jenkins/workspace/${jobname}/testing.jar"
  }
