package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class deyl implements Consumer {
    public final /* synthetic */ ewmx a;

    public /* synthetic */ deyl(ewmx ewmxVar) {
        this.a = ewmxVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        ewmx ewmxVar = this.a;
        String str = (String) obj;
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        ewng ewngVar2 = ewng.a;
        str.getClass();
        ewngVar.b |= 64;
        ewngVar.g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
