package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xdb extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ xdz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdb(xdz xdzVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = xdzVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xdb xdbVar = new xdb(this.e, (fcxy) obj5);
        xdbVar.a = (String) obj;
        xdbVar.b = (String) obj2;
        xdbVar.c = (waa) obj3;
        xdbVar.d = (Integer) obj4;
        return xdbVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        djgx djgxVar;
        Object obj2;
        fctl.b(obj);
        ?? r2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        xdz xdzVar = this.e;
        if (obj4 != null) {
            waa waaVar = (waa) obj4;
            int i = waaVar.b;
            if (i != 1) {
                String string = xdzVar.b.getString(R.string.multiple_messages_counter, new Integer(waaVar.a), new Integer(i));
                string.getClass();
                djgx djgxVar2 = new djgx(string, waaVar.c);
                obj2 = obj5;
                djgxVar = djgxVar2;
                return new djcv(xdzVar.m, r2, (String) obj3, (Integer) obj2, 0, true, djgxVar, new djcu(xdzVar.g.a(), xdzVar.h.a()), 16);
            }
            String string2 = xdzVar.b.getString(R.string.single_message_counter, new Integer(waaVar.a));
            string2.getClass();
            djgxVar = new djgx(string2, waaVar.c);
        } else {
            djgxVar = null;
        }
        obj2 = obj5;
        return new djcv(xdzVar.m, r2, (String) obj3, (Integer) obj2, 0, true, djgxVar, new djcu(xdzVar.g.a(), xdzVar.h.a()), 16);
    }
}
