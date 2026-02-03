package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqye {
    protected Map b;
    protected final String c;
    public final dqyf e;
    public final ContentValues a = new ContentValues();
    protected final ekfw d = new ekfw();

    protected dqye(String str) {
        this.c = str;
        dqpa dqpaVar = new dqpa();
        dqpaVar.e(false);
        dqpaVar.f(dqru.c.v());
        dqpaVar.d(false);
        dqpaVar.b = "main";
        dqpaVar.c(0);
        dqpaVar.b = "$primary";
        dqpaVar.a = dqsb.a;
        this.e = dqpaVar;
    }

    private final dqsy a() {
        return dqru.e(((dqpb) this.e.g()).e);
    }

    public final int ae(dqyj dqyjVar, String str) {
        ekfw ekfwVar = this.d;
        if (!ekfwVar.g().isEmpty()) {
            throw new IllegalStateException("don't combine updateFor and custom where");
        }
        ekfwVar.h(dqyjVar);
        ap(str);
        return b().g(a(), 0, dqxp.b());
    }

    public final void af(dqyj dqyjVar) {
        this.d.h(dqyjVar);
    }

    public final void ag(String str, dqxe dqxeVar) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, dqxeVar);
    }

    protected final void ah() {
        dqyg dqygVar = ((dqpb) this.e.g()).h;
        if (dqygVar != null) {
            dqpc dqpcVar = (dqpc) dqygVar;
            ekgb ekgbVar = dqpcVar.b;
            ejwl.l(!ekgbVar.isEmpty());
            ejwl.l(true);
            ejwl.l(dqpcVar.a.getColumnCount() + (-1) == ekgbVar.size());
        }
    }

    public final void ai(dqpo dqpoVar) {
        this.a.remove(dqpoVar.d());
    }

    public final boolean aj(dqyj dqyjVar, String str) {
        ekfw ekfwVar = this.d;
        if (!ekfwVar.g().isEmpty()) {
            throw new IllegalStateException("don't combine updateFor and custom where");
        }
        ekfwVar.h(dqyjVar);
        ap(str);
        return b().g(a(), 0, dqxp.b()) != 0;
    }

    public final void ak() {
        this.e.e(true);
    }

    public final void al() {
        this.e.f(false);
    }

    public final void am() {
        this.e.f(true);
    }

    public final void an(dqsb dqsbVar) {
        ((dqpa) this.e).a = dqsbVar;
    }

    public final void ao(ekgb ekgbVar, Cursor cursor, dqxe dqxeVar) {
        ((dqpa) this.e).c = new dqpc(cursor, ekgbVar, dqxeVar);
    }

    public final void ap(String str) {
        an(new dqsb(str));
    }

    public abstract dqyd b();

    public final boolean equals(Object obj) {
        return (obj instanceof dqye) && this.a.equals(((dqye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
