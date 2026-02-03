package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahco {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer");
    public static final List b;
    public final ea c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final ahci i;
    public final ehay j;

    static {
        ekgb ekgbVarC = ekgb.C(Integer.valueOf(R.id.key_part_1), Integer.valueOf(R.id.key_part_2), Integer.valueOf(R.id.key_part_3), Integer.valueOf(R.id.key_part_4), Integer.valueOf(R.id.key_part_5), Integer.valueOf(R.id.key_part_6), Integer.valueOf(R.id.key_part_7), Integer.valueOf(R.id.key_part_8), Integer.valueOf(R.id.key_part_9), Integer.valueOf(R.id.key_part_10), Integer.valueOf(R.id.key_part_11), Integer.valueOf(R.id.key_part_12), new Integer[0]);
        ekgbVarC.getClass();
        b = ekgbVarC;
    }

    public ahco(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ahci ahciVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        this.c = eaVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = ahciVar;
        this.j = new ahcl(this);
    }

    public final View a() {
        View viewFindViewById = this.c.N().findViewById(R.id.grid_view);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    public final boolean b() {
        return (this.i.b & 4) != 0;
    }
}
