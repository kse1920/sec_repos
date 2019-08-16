Function TestPath
        {
                PARAM (
                [PARAMETER(Mandatory=$True,Position=0,HelpMessage = "Путь до проверяемого ресурса",ParameterSetName='Path')]$Path
                )
                Return(Test-Path $Path)
        }