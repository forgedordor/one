package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bplg extends dqpg {
    public long a;
    public MessageIdType b;
    public bvdo c;
    public long d;
    public boolean e;
    public Duration f;

    public bplg() {
        super(bpmq.e());
        this.b = bary.a;
        this.e = false;
        this.f = barr.b(0L);
    }

    public final bple a() {
        bplf bplfVar = new bplf();
        bplfVar.aD(aB());
        bplfVar.a = this.a;
        bplfVar.b = this.b;
        bplfVar.c = this.c;
        bplfVar.d = this.d;
        bplfVar.e = this.e;
        bplfVar.f = this.f;
        bplfVar.cM = aC();
        return bplfVar;
    }

    public final void b(Duration duration) {
        int i = this.aB;
        if (i < 60710) {
            dqru.x("flagged_message_delay", i);
        }
        aE(5);
        this.f = duration;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        int i = this.aB;
        if (i < 39030) {
            dqru.x("flagged_message_timestamp", i);
        }
        aE(3);
        this.d = j;
    }

    public final void e(bvdo bvdoVar) {
        aE(2);
        this.c = bvdoVar;
    }
}
