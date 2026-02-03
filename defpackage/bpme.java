package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpme extends dqqf implements bplx {
    @Deprecated
    public bpme(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpmk bpmkVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpmq.a, dqwjVar, dqtmVar, bpmkVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bplf();
    }

    public final long c() {
        return getLong(cO(3, bpmq.a));
    }

    public final long e() {
        return getLong(cO(0, bpmq.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cO(1, bpmq.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        bvdo[] bvdoVarArr;
        char c;
        boolean[] zArr;
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
                Duration[] durationArr = null;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bpmq.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bply
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, bpmq.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(jArrDt[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bplz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "flagged_message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    bvdoVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(2, bpmq.a)));
                    bvdo[] bvdoVarArrValues = bvdo.values();
                    int length3 = bvdoVarArrValues.length;
                    bvdo[] bvdoVarArr2 = new bvdo[iArrDs.length];
                    for (int i3 = 0; i3 < iArrDs.length; i3++) {
                        int i4 = iArrDs[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        bvdoVarArr2[i3] = bvdoVarArrValues[i4];
                    }
                    bvdoVarArr = (bvdo[]) dqru.D(null, bvdoVarArr2, new bvdo[0]);
                } else {
                    bvdoVarArr = new bvdo[]{g()};
                }
                dqqf.dA(length, bvdoVarArr, new ejxr() { // from class: bpma
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "flagging_reason:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                long[] jArrC2 = dj(3) ? z ? dqru.C(null, dt(getString(cO(3, bpmq.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bpmb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "flagged_message_timestamp:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                char c2 = 4;
                boolean[] zArrE = dj(4) ? z ? dqru.E(null, dv(getString(cO(4, bpmq.a)))) : new boolean[]{i()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: bpmc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "flagged_message_notified:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (dj(5)) {
                    if (z) {
                        long[] jArrDt2 = dt(getString(cO(5, bpmq.a)));
                        int length4 = jArrDt2.length;
                        Duration[] durationArr2 = new Duration[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            durationArr2[i5] = barr.b(jArrDt2[i5]);
                        }
                        durationArr = (Duration[]) dqru.D(null, durationArr2, new Duration[0]);
                    } else {
                        durationArr = new Duration[]{h()};
                    }
                }
                dqqf.dA(length, durationArr, new ejxr() { // from class: bpmd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "flagged_message_delay:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i6 = 0;
                while (i6 < length) {
                    long j = jArrDC[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        zArr = zArrE;
                    } else {
                        hashSet.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr = bpmq.a;
                        bplh bplhVar = new bplh();
                        bplhVar.aF();
                        bplhVar.aD();
                        long j2 = jArrDC[i6];
                        zArr = zArrE;
                        if (jArrC != null) {
                            long j3 = jArrC[i6];
                            bplhVar.aE(i);
                            bplhVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            bplhVar.c(messageIdTypeArr[i6]);
                        }
                        if (bvdoVarArr != null) {
                            bplhVar.e(bvdoVarArr[i6]);
                        }
                        if (jArrC2 != null) {
                            bplhVar.d(jArrC2[i6]);
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i6];
                            int i7 = bplhVar.aB;
                            if (i7 < 46030) {
                                dqru.x("flagged_message_notified", i7);
                            }
                            c = 4;
                            bplhVar.aE(4);
                            bplhVar.e = z2;
                        } else {
                            c = 4;
                        }
                        if (durationArr != null) {
                            bplhVar.b(durationArr[i6]);
                        }
                        ekfwVar.h(bplhVar.a());
                    }
                    i6++;
                    c2 = c;
                    zArrE = zArr;
                    i = 0;
                }
                return ekfwVar.g();
            }
        }
        int i8 = ekgb.d;
        return ekoe.a;
    }

    public final bvdo g() {
        bvdo[] bvdoVarArrValues = bvdo.values();
        int i = getInt(cO(2, bpmq.a));
        if (i < bvdoVarArrValues.length) {
            return bvdoVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Duration h() {
        return barr.b(getLong(cO(5, bpmq.a)));
    }

    public final boolean i() {
        return getInt(cO(4, bpmq.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
