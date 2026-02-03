package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtz extends fcyv {
    public /* synthetic */ Object a;
    final /* synthetic */ LoadMessagesReceiver b;
    public int c;
    public String d;
    public String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtz(LoadMessagesReceiver loadMessagesReceiver, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = loadMessagesReceiver;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, this);
    }
}
