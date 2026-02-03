package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btbj extends dqqf implements btbc {
    @Deprecated
    public btbj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btbn btbnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btbt.a, dqwjVar, dqtmVar, btbnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btaj();
    }

    public final long c() {
        return getLong(cO(2, btbt.a));
    }

    public final long e() {
        return getLong(cO(4, btbt.a));
    }

    public final long f() {
        return getLong(cO(3, btbt.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                Optional[] optionalArr = null;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btbt.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btbd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, btbt.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: btbe
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                long[] jArrC = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, btbt.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: btbf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, btbt.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: btbg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "receive_time:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                long[] jArrC3 = dj(4) ? z ? dqru.C(null, dt(getString(cO(4, btbt.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: btbh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "read_time:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (dj(5)) {
                    if (z) {
                        long[] jArrDt2 = dt(getString(cO(5, btbt.a)));
                        int length3 = jArrDt2.length;
                        Optional[] optionalArr2 = new Optional[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            optionalArr2[i2] = basb.b(jArrDt2[i2]);
                        }
                        optionalArr = (Optional[]) dqru.D(null, optionalArr2, new Optional[0]);
                    } else {
                        optionalArr = new Optional[]{h()};
                    }
                }
                dqqf.dA(length, optionalArr, new ejxr() { // from class: btbi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "ftd_time:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = jArrDC[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i3]));
                        btak btakVarA = btbt.a();
                        btakVarA.aD();
                        long j2 = jArrDC[i3];
                        if (strArr != null) {
                            btakVarA.c(strArr[i3]);
                        }
                        if (messageIdTypeArr != null) {
                            btakVarA.d(messageIdTypeArr[i3]);
                        }
                        if (jArrC != null) {
                            btakVarA.e(jArrC[i3]);
                        }
                        if (jArrC2 != null) {
                            btakVarA.g(jArrC2[i3]);
                        }
                        if (jArrC3 != null) {
                            btakVarA.f(jArrC3[i3]);
                        }
                        if (optionalArr != null) {
                            btakVarA.b(optionalArr[i3]);
                        }
                        ekfwVar.h(btakVarA.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(1, btbt.a)));
    }

    public final Optional h() {
        return basb.b(getLong(cO(5, btbt.a)));
    }

    public final String i() {
        return getString(cO(0, btbt.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
