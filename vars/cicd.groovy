def newGit(repo)
{
  git"${repo}"
}


def call1()
{
  echo "hello i am call-1"
}

def call2()
{
  sh 'echo "hello i am call-2"'
}

def call3(a)
{
  echo "hello my name is ...${a} '
}

