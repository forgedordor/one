package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnbn extends dqqf implements bnbh {
    @Deprecated
    public bnbn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bnbu bnbuVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bncb.a, dqwjVar, dqtmVar, bnbuVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bnas();
    }

    @Override // defpackage.bnbh
    public final String c() {
        return getString(cO(3, bncb.a));
    }

    @Override // defpackage.bnbh
    public final String e() {
        return getString(cO(4, bncb.a));
    }

    @Override // defpackage.bnbh
    public final byte[] f() {
        return getBlob(cO(1, bncb.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                int[] iArrA = zDj ? z ? dqru.A(null, ds(getString(cO(0, bncb.a)))) : new int[]{g()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bnbi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "key_index:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                byte[][] bArrF = dj(1) ? z ? dqru.F(null, dD(getString(cO(1, bncb.a)))) : new byte[][]{f()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: bnbj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "encryption_key:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                int[] iArrA2 = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, bncb.a)))) : new int[]{h()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: bnbk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "key_type:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bncb.a))), new String[0]) : new String[]{c()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bnbl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr2 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bncb.a))), new String[0]) : new String[]{e()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bnbm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i = 0; i < length; i++) {
                    long j = jArrDC[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i]));
                        String[] strArr3 = bncb.a;
                        bnau bnauVar = new bnau();
                        bnauVar.aF();
                        bnauVar.aD();
                        long j2 = jArrDC[i];
                        if (iArrA != null) {
                            bnauVar.e(iArrA[i]);
                        }
                        if (bArrF != null) {
                            bnauVar.d(bArrF[i]);
                        }
                        if (iArrA2 != null) {
                            bnauVar.f(iArrA2[i]);
                        }
                        if (strArr != null) {
                            bnauVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bnauVar.c(strArr2[i]);
                        }
                        ekfwVar.h(bnauVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    public final int g() {
        return getInt(cO(0, bncb.a));
    }

    public final int h() {
        return getInt(cO(2, bncb.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
