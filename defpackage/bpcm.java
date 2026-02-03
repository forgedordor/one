package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpcm extends dqqf implements bpce {
    @Deprecated
    public bpcm(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpcs bpcsVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpcy.a, dqwjVar, dqtmVar, bpcsVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpbk();
    }

    public final wry c() {
        byte[] blob = getBlob(cO(2, bpcy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wry) evsn.parseFrom(wry.a, blob, evrr.a());
        } catch (Throwable unused) {
            return wry.a;
        }
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(0, bpcy.a)));
    }

    public final String f() {
        return getString(cO(5, bpcy.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        wry[] wryVarArr;
        wry wryVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bpcy.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(jArrDt[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bpcf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bpcy.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpcg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "text:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    wryVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(2, bpcy.a)));
                    wry[] wryVarArr2 = new wry[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i3 = i2 + 1;
                            if (bArrZ == null) {
                                wryVar = null;
                            } else {
                                try {
                                    wryVar = (wry) evsn.parseFrom(wry.a, bArrZ);
                                } catch (Throwable unused) {
                                    i2 = i3;
                                    wryVarArr2[i2] = null;
                                    i2++;
                                }
                            }
                            wryVarArr2[i2] = wryVar;
                            i2 = i3;
                        } catch (Throwable unused2) {
                        }
                    }
                    wryVarArr = (wry[]) dqru.D(null, wryVarArr2, new wry[0]);
                } else {
                    wryVarArr = new wry[]{c()};
                }
                dqqf.dA(length, wryVarArr, new ejxr() { // from class: bpch
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachments:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr2 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bpcy.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: bpci
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "subject:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                boolean[] zArrE = dj(4) ? z ? dqru.E(null, dv(getString(cO(4, bpcy.a)))) : new boolean[]{j()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: bpcj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_urgent:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr3 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bpcy.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: bpck
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "replied_to_message_id:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                boolean[] zArrE2 = dj(6) ? z ? dqru.E(null, dv(getString(cO(6, bpcy.a)))) : new boolean[]{i()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: bpcl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_encrypted:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr4 = bpcy.a;
                        bpbm bpbmVar = new bpbm();
                        bpbmVar.aF();
                        bpbmVar.aD();
                        long j2 = jArrDC[i4];
                        if (conversationIdTypeArr != null) {
                            bpbmVar.c(conversationIdTypeArr[i4]);
                        }
                        if (strArr != null) {
                            bpbmVar.h(strArr[i4]);
                        }
                        if (wryVarArr != null) {
                            bpbmVar.b(wryVarArr[i4]);
                        }
                        if (strArr2 != null) {
                            bpbmVar.g(strArr2[i4]);
                        }
                        if (zArrE != null) {
                            bpbmVar.e(zArrE[i4]);
                        }
                        if (strArr3 != null) {
                            bpbmVar.f(strArr3[i4]);
                        }
                        if (zArrE2 != null) {
                            bpbmVar.d(zArrE2[i4]);
                        }
                        ekfwVar.h(bpbmVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    public final String g() {
        return getString(cO(3, bpcy.a));
    }

    public final String h() {
        return getString(cO(1, bpcy.a));
    }

    public final boolean i() {
        return getInt(cO(6, bpcy.a)) == 1;
    }

    public final boolean j() {
        return getInt(cO(4, bpcy.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
