package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfc extends dqqf implements bqew {
    @Deprecated
    public bqfc(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bqfh bqfhVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bqfo.a, dqwjVar, dqtmVar, bqfhVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqed();
    }

    @Override // defpackage.bqew
    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(1, bqfo.a)));
    }

    @Override // defpackage.bqew
    public final ekgb e() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(h());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bqew
    public final Instant f() {
        return bart.b(getLong(cO(3, bqfo.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        basd[] basdVarArr;
        Instant[] instantArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                Instant[] instantArr2 = null;
                if (!zDj) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(0, bqfo.a)));
                    int length2 = jArrDt.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr3[i] = new MessageIdType(jArrDt[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{h()};
                }
                dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: bqex
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(1, bqfo.a)));
                    int length3 = jArrDt2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        messageIdTypeArr4[i2] = new MessageIdType(jArrDt2[i2]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dqru.D(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{c()};
                }
                dqqf.dA(length, messageIdTypeArr2, new ejxr() { // from class: bqey
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "latest_message_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    basdVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(2, bqfo.a)));
                    int length4 = strArrDu.length;
                    basd[] basdVarArr2 = new basd[length4];
                    for (int i3 = 0; i3 < length4; i3++) {
                        basdVarArr2[i3] = basd.a(strArrDu[i3]);
                    }
                    basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
                } else {
                    basdVarArr = new basd[]{i()};
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: bqez
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt3 = dt(getString(cO(3, bqfo.a)));
                    int length5 = jArrDt3.length;
                    Instant[] instantArr3 = new Instant[length5];
                    for (int i4 = 0; i4 < length5; i4++) {
                        instantArr3[i4] = bart.b(jArrDt3[i4]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bqfa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "edited_at_timestamp_ms:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (dj(4)) {
                    if (z) {
                        long[] jArrDt4 = dt(getString(cO(4, bqfo.a)));
                        int length6 = jArrDt4.length;
                        Instant[] instantArr4 = new Instant[length6];
                        for (int i5 = 0; i5 < length6; i5++) {
                            instantArr4[i5] = bart.b(jArrDt4[i5]);
                        }
                        instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{g()};
                    }
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: bqfb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "received_at_timestamp_ms:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i6 = 0; i6 < length; i6++) {
                    long j = jArrDC[i6];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i6]));
                        String[] strArr = bqfo.a;
                        bqeh bqehVar = new bqeh();
                        bqehVar.aF();
                        bqehVar.aD();
                        long j2 = jArrDC[i6];
                        if (messageIdTypeArr != null) {
                            bqehVar.e(messageIdTypeArr[i6]);
                        }
                        if (messageIdTypeArr2 != null) {
                            bqehVar.d(messageIdTypeArr2[i6]);
                        }
                        if (basdVarArr != null) {
                            bqehVar.f(basdVarArr[i6]);
                        }
                        if (instantArr != null) {
                            bqehVar.c(instantArr[i6]);
                        }
                        if (instantArr2 != null) {
                            bqehVar.g(instantArr2[i6]);
                        }
                        ekfwVar.h(bqehVar.a(new Supplier() { // from class: bqef
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bqed();
                            }
                        }));
                    }
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.bqew
    public final Instant g() {
        return bart.b(getLong(cO(4, bqfo.a)));
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cO(0, bqfo.a)));
    }

    public final basd i() {
        return basd.a(getString(cO(2, bqfo.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
