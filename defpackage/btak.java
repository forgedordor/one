package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btak extends dqpg {
    public String a;
    public MessageIdType b;
    public long c;
    public long d;
    public long e;
    public Optional f;

    public btak() {
        super(btbt.f());
        this.b = bary.a;
        this.d = 0L;
        this.e = 0L;
        this.f = basb.b(-1L);
    }

    public final btai a() {
        btaj btajVar = new btaj();
        btajVar.aD(aB());
        btajVar.a = this.a;
        btajVar.b = this.b;
        btajVar.c = this.c;
        btajVar.d = this.d;
        btajVar.e = this.e;
        btajVar.f = this.f;
        btajVar.cM = aC();
        return btajVar;
    }

    public final void b(Optional optional) {
        int i = this.aB;
        if (i < 58880) {
            dqru.x("ftd_time", i);
        }
        aE(5);
        this.f = optional;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void e(long j) {
        aE(2);
        this.c = j;
    }

    public final void f(long j) {
        aE(4);
        this.e = j;
    }

    public final void g(long j) {
        aE(3);
        this.d = j;
    }
}
