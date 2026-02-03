package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buxr extends dqpg {
    public String a;
    public MessageIdType b;
    public long c;
    public long d;

    public buxr() {
        super(buyx.c());
        this.b = bary.a;
    }

    public final buxp a() {
        buxq buxqVar = new buxq();
        buxqVar.aD(aB());
        buxqVar.a = this.a;
        buxqVar.b = this.b;
        buxqVar.c = this.c;
        buxqVar.d = this.d;
        buxqVar.cM = aC();
        return buxqVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        aE(2);
        this.c = j;
    }

    public final void e(long j) {
        aE(3);
        this.d = j;
    }
}
