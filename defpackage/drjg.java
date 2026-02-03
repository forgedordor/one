package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjg extends fy {
    private final List a;
    private int b;

    public drjg(fr frVar, List list, int i) {
        super(frVar);
        this.b = 0;
        if (list == null) {
            throw new NullPointerException("Questions were missing!");
        }
        this.a = list;
        this.b = i;
    }

    public static int m(ea eaVar) {
        return eaVar.m.getInt("QuestionIndex", -1);
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        ea drirVar;
        erwu erwuVar = (erwu) this.a.get(i);
        int i2 = erwuVar.d;
        int iB = erxc.b(i2);
        if (iB == 0) {
            iB = 1;
        }
        int i3 = iB - 2;
        if (i3 == 1) {
            int i4 = this.b;
            drirVar = new drir();
            drirVar.at(drir.a(erwuVar, i4, i));
        } else if (i3 == 2) {
            int i5 = this.b;
            drirVar = new driu();
            drirVar.at(driu.a(erwuVar, i5, i));
        } else if (i3 == 3) {
            int i6 = this.b;
            drirVar = new drix();
            drirVar.at(drix.a(erwuVar, i6, i));
        } else {
            if (i3 != 4) {
                int iB2 = erxc.b(i2);
                if (iB2 == 0) {
                    iB2 = 1;
                }
                throw new AssertionError(String.format("Attempted to build fragment for unsupported Question type %s.  Note this should never happen as it's invalid to create a Question type that does not have a matching fragment.", Integer.toString(iB2 - 2)));
            }
            int i7 = this.b;
            drirVar = new driz();
            drirVar.at(driz.a(erwuVar, i7, i));
        }
        drirVar.m.putInt("QuestionIndex", i);
        return drirVar;
    }

    @Override // defpackage.pou
    public final int j() {
        return this.a.size();
    }
}
