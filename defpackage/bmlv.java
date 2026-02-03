package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmlv extends dqqf implements bmlo {
    @Deprecated
    public bmlv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmlz bmlzVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmmf.a, dqwjVar, dqtmVar, bmlzVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmkw();
    }

    public final int c() {
        return getInt(cO(3, bmmf.a));
    }

    public final long e() {
        return getLong(cO(5, bmmf.a));
    }

    public final long f() {
        return getLong(cO(0, bmmf.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        aslb[] aslbVarArr;
        asqe[] asqeVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmmf.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bmlp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bmmf.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(jArrDt[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{i()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bmlq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    aslbVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, bmmf.a)));
                    aslb[] aslbVarArr2 = new aslb[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        aslb aslbVarB = aslb.b(iArrDs[i3]);
                        if (aslbVarB == null) {
                            throw new IllegalStateException();
                        }
                        aslbVarArr2[i3] = aslbVarB;
                    }
                    aslbVarArr = (aslb[]) dqru.D(null, aslbVarArr2, new aslb[0]);
                } else {
                    aslbVarArr = new aslb[]{g()};
                }
                dqqf.dA(length, aslbVarArr, new ejxr() { // from class: bmlr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "chatbot_directory_conversation_state:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bmmf.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bmls
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_stop_state:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    asqeVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(4, bmmf.a)));
                    asqe[] asqeVarArr2 = new asqe[iArrDs2.length];
                    for (int i4 = 0; i4 < iArrDs2.length; i4++) {
                        asqe asqeVarB = asqe.b(iArrDs2[i4]);
                        if (asqeVarB == null) {
                            throw new IllegalStateException();
                        }
                        asqeVarArr2[i4] = asqeVarB;
                    }
                    asqeVarArr = (asqe[]) dqru.D(null, asqeVarArr2, new asqe[0]);
                } else {
                    asqeVarArr = new asqe[]{h()};
                }
                dqqf.dA(length, asqeVarArr, new ejxr() { // from class: bmlt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_toolstone_state:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                long[] jArrC2 = dj(5) ? z ? dqru.C(null, dt(getString(cO(5, bmmf.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bmlu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_toolstone_timestamp_ms:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr = bmmf.a;
                        bmky bmkyVar = new bmky();
                        bmkyVar.aF();
                        bmkyVar.aD();
                        long j2 = jArrDC[i5];
                        if (jArrC != null) {
                            long j3 = jArrC[i5];
                            bmkyVar.aE(i);
                            bmkyVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            bmkyVar.c(conversationIdTypeArr[i5]);
                        }
                        if (aslbVarArr != null) {
                            bmkyVar.b(aslbVarArr[i5]);
                        }
                        if (iArrA != null) {
                            int i6 = iArrA[i5];
                            int i7 = bmkyVar.aB;
                            if (i7 < 59010) {
                                dqru.x("conversation_stop_state", i7);
                            }
                            bmkyVar.aE(3);
                            bmkyVar.d = i6;
                        }
                        if (asqeVarArr != null) {
                            bmkyVar.d(asqeVarArr[i5]);
                        }
                        if (jArrC2 != null) {
                            bmkyVar.e(jArrC2[i5]);
                        }
                        ekfwVar.h(bmkyVar.a());
                    }
                    i5++;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final aslb g() {
        return aslb.b(getInt(cO(2, bmmf.a)));
    }

    public final asqe h() {
        return asqe.b(getInt(cO(4, bmmf.a)));
    }

    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cO(1, bmmf.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
