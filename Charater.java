class Character {
    private String name;
    private int level;
    private int exp;
    private int money;
    private int hp;
    private int power;
    private int maxHp;


    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }

    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }

    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }

    public void setExp(int exp){
        this.exp= exp;
    }
    public int getExp(){
        return exp;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp)
    {
        this.maxHp = maxHp;
    }

}
