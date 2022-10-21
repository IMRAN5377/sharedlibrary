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
  echo "hello my name is ...${a}"
}

def call4(a,b,c,d)
{
  echo " hello my name is ..${a}..${b}..${C} from ${d}"
}

