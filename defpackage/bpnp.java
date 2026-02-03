package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpnp extends dqqf implements bpnl {
    @Deprecated
    public bpnp(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpnu bpnuVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpoa.a, dqwjVar, dqtmVar, bpnuVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpmy();
    }

    public final axcm c() {
        return axcn.a(getString(cO(1, bpoa.a)));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cO(0, bpoa.a)));
    }

    public final String f() {
        return getString(cO(2, bpoa.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        ConversationIdType[] conversationIdTypeArr;
        axcm[] axcmVarArr;
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
                    long[] jArrDt = dt(getString(cO(0, bpoa.a)));
                    int length2 = jArrDt.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(jArrDt[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dqru.D(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dqqf.dA(length, conversationIdTypeArr, new ejxr() { // from class: bpnm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    axcmVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(1, bpoa.a)));
                    int length3 = strArrDu.length;
                    axcm[] axcmVarArr2 = new axcm[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        axcmVarArr2[i2] = axcn.a(strArrDu[i2]);
                    }
                    axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr2, new axcm[0]);
                } else {
                    axcmVarArr = new axcm[]{c()};
                }
                dqqf.dA(length, axcmVarArr, new ejxr() { // from class: bpnn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "my_identity_token:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bpoa.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: bpno
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "gemini_conversation_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        String[] strArr2 = bpoa.a;
                        bpna bpnaVar = new bpna();
                        bpnaVar.aF();
                        bpnaVar.aD();
                        long j2 = jArrDC[i3];
                        if (conversationIdTypeArr != null) {
                            bpnaVar.b(conversationIdTypeArr[i3]);
                        }
                        if (axcmVarArr != null) {
                            bpnaVar.d(axcmVarArr[i3]);
                        }
                        if (strArr != null) {
                            bpnaVar.c(strArr[i3]);
                        }
                        ekfwVar.h(bpnaVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
