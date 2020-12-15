package com.vorozheykin.Patterns.Singletone;

public class JumpKick implements Skillable {

    private static JumpKick jumpKick = new JumpKick();

    private JumpKick(){}

    public static JumpKick getInstance(){
        if(jumpKick == null){
            jumpKick = new JumpKick();
        }
        return jumpKick;
    }

    @Override
    public void skillSound(KarateBoy karateBoy) {
        karateBoy.jumpKick();
    }
}
