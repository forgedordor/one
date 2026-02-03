package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjk {
    public static final zjk a;
    public static final zjk b;
    public static final zjk c;
    public static final zjk d;
    public static final zjk e;
    public static final zjk f;
    public static final /* synthetic */ fcza g;
    private static final /* synthetic */ zjk[] j;
    public final djrr h;
    public final int i;

    static {
        zjk zjkVar = new zjk("ILLNESS", 0, djrr.cf, R.string.emergency_questionnaire_card_option_illness);
        a = zjkVar;
        zjk zjkVar2 = new zjk("VEHICLE", 1, djrr.aL, R.string.emergency_questionnaire_card_option_vehicle);
        b = zjkVar2;
        zjk zjkVar3 = new zjk("LOST", 2, djrr.bl, R.string.emergency_questionnaire_card_option_lost);
        c = zjkVar3;
        zjk zjkVar4 = new zjk("CRIME", 3, djrr.cg, R.string.emergency_questionnaire_card_option_crime);
        d = zjkVar4;
        zjk zjkVar5 = new zjk("FIRE", 4, djrr.ce, R.string.emergency_questionnaire_card_option_fire);
        e = zjkVar5;
        zjk zjkVar6 = new zjk("ELSE", 5, djrr.bN, R.string.emergency_questionnaire_card_option_else);
        f = zjkVar6;
        zjk[] zjkVarArr = {zjkVar, zjkVar2, zjkVar3, zjkVar4, zjkVar5, zjkVar6};
        j = zjkVarArr;
        g = fczb.a(zjkVarArr);
    }

    private zjk(String str, int i, djrr djrrVar, int i2) {
        this.h = djrrVar;
        this.i = i2;
    }

    public static zjk a(String str) {
        return (zjk) Enum.valueOf(zjk.class, str);
    }

    public static zjk[] values() {
        return (zjk[]) j.clone();
    }
}
