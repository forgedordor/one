package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjh {
    public static final int a() throws IOException {
        bnfb bnfbVarA = bnfe.a();
        bnfbVarA.A("getContactCount");
        bnfbVarA.v();
        int i = 0;
        bnfbVarA.n(new dqxl("COUNT(distinct $V)", new Object[]{bnfe.c.b}), "count");
        dqqj dqqjVarP = bnfbVarA.b().p();
        try {
            bndx bndxVar = (bndx) dqqjVarP;
            if (bndxVar.moveToNext()) {
                String strDe = bndxVar.de("count");
                strDe.getClass();
                i = Integer.parseInt(strDe);
            }
            fczl.a(dqqjVarP, null);
            return i;
        } finally {
        }
    }
}
