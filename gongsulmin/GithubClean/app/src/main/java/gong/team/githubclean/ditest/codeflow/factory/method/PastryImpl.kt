package gong.team.githubclean.ditest.codeflow.factory.method

import gong.team.githubclean.ditest.codeflow.factory.method.Pastry


class Puff: Pastry {
    override fun getFirstTimeImpression(): String {
        return "Puff"
    }

}

class Baklava: Pastry {
    override fun getFirstTimeImpression(): String{
        return  "Baklava"
    }

}


class Flaky: Pastry {
    override fun getFirstTimeImpression(): String {
        return "flaky"
    }

}


class Cinnamonroll: Pastry {
    override fun getFirstTimeImpression(): String {
        return "CINNAMONROLL"
    }

}

