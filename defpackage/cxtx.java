package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtx extends fcyv {
    public int a;
    public Object b;
    public boolean c;
    public /* synthetic */ Object d;
    final /* synthetic */ LoadMessagesReceiver e;
    public int f;
    public fdci g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtx(LoadMessagesReceiver loadMessagesReceiver, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = loadMessagesReceiver;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(0, null, false, this);
    }
}
