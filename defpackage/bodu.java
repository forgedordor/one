package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bodu extends dqpg {
    public long a;
    public MessageIdType b;
    public int c;
    public String d;
    public String e;
    public String f;
    public basd g;
    public basd h;
    public boolean i;
    public long j;

    public bodu() {
        super(bofr.d());
        this.b = bary.a;
        this.c = 0;
        basd basdVar = basd.a;
        this.g = basdVar;
        this.h = basdVar;
        this.i = false;
        this.j = 0L;
    }

    public final bods a() {
        bodt bodtVar = new bodt();
        bodtVar.aD(aB());
        bodtVar.a = this.a;
        bodtVar.b = this.b;
        bodtVar.c = this.c;
        bodtVar.d = this.d;
        bodtVar.e = this.e;
        bodtVar.f = this.f;
        bodtVar.g = this.g;
        bodtVar.h = this.h;
        bodtVar.i = this.i;
        bodtVar.j = this.j;
        bodtVar.cM = aC();
        return bodtVar;
    }

    public final void b(int i) {
        aE(2);
        this.c = i;
    }

    public final void c(String str) {
        aE(4);
        this.e = str;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(basd basdVar) {
        int i = this.aB;
        if (i < 11001) {
            dqru.x("rcs_message_id", i);
        }
        aE(6);
        this.g = basdVar;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 12000) {
            dqru.x("read", i);
        }
        aE(8);
        this.i = z;
    }

    public final void h(long j) {
        int i = this.aB;
        if (i < 12000) {
            dqru.x("received_timestamp", i);
        }
        aE(9);
        this.j = j;
    }

    public final void i(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void j(basd basdVar) {
        int i = this.aB;
        if (i < 12000) {
            dqru.x("target_rcs_message_id", i);
        }
        aE(7);
        this.h = basdVar;
    }
}
