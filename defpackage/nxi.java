package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxi implements nvn {
    private final mfr a = new mfr();

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) {
        mdu mduVarA;
        mfr mfrVar = this.a;
        mfrVar.I(bArr, i2 + i);
        mfrVar.K(i);
        ArrayList arrayList = new ArrayList();
        while (mfrVar.a() > 0) {
            mee.b(mfrVar.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iE = mfrVar.e() - 8;
            if (mfrVar.e() == 1987343459) {
                CharSequence charSequenceA = null;
                mdt mdtVarA = null;
                while (iE > 0) {
                    mee.b(iE >= 8, "Incomplete vtt cue box header found.");
                    int iE2 = mfrVar.e();
                    int iE3 = mfrVar.e();
                    int i3 = iE - 8;
                    int i4 = iE2 - 8;
                    String strK = mgb.K(mfrVar.a, mfrVar.b, i4);
                    mfrVar.L(i4);
                    if (iE3 == 1937011815) {
                        Pattern pattern = nxr.a;
                        nxq nxqVar = new nxq();
                        nxr.c(strK, nxqVar);
                        mdtVarA = nxqVar.a();
                    } else if (iE3 == 1885436268) {
                        charSequenceA = nxr.a(null, strK.trim(), Collections.EMPTY_LIST);
                    }
                    iE = i3 - i4;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (mdtVarA != null) {
                    mdtVarA.a = charSequenceA;
                    mduVarA = mdtVarA.a();
                } else {
                    Pattern pattern2 = nxr.a;
                    nxq nxqVar2 = new nxq();
                    nxqVar2.c = charSequenceA;
                    mduVarA = nxqVar2.a().a();
                }
                arrayList.add(mduVarA);
            } else {
                mfrVar.L(iE);
            }
        }
        meoVar.a(new nut(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
