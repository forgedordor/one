package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygc extends evsf implements evui {
    public eygc() {
        super(eyge.a);
    }

    public final void a(Map map) {
        copyOnWrite();
        eyge eygeVar = (eyge) this.instance;
        eyge eygeVar2 = eyge.a;
        eygeVar.a().putAll(map);
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        eyge eygeVar = (eyge) this.instance;
        eyge eygeVar2 = eyge.a;
        eygeVar.a().put(str, str2);
    }
}
