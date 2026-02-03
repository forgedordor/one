package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjn extends ekbr implements Serializable, ekjo {
    private static final long serialVersionUID = 0;
    public transient ekjk a;
    public transient ekjk b;
    public transient Map c;
    public transient int d;
    public transient int e;

    public ekjn() {
        this(12);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = new ekdm();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            t(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Map.Entry entry : u()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean A() {
        return this.a == null;
    }

    public final ekjk a(Object obj, Object obj2, ekjk ekjkVar) {
        ekjk ekjkVar2 = new ekjk(obj, obj2);
        if (this.a == null) {
            this.b = ekjkVar2;
            this.a = ekjkVar2;
            this.c.put(obj, new ekjj(ekjkVar2));
            this.e++;
        } else if (ekjkVar == null) {
            ekjk ekjkVar3 = this.b;
            ekjkVar3.getClass();
            ekjkVar3.c = ekjkVar2;
            ekjkVar2.d = ekjkVar3;
            this.b = ekjkVar2;
            ekjj ekjjVar = (ekjj) this.c.get(obj);
            if (ekjjVar == null) {
                this.c.put(obj, new ekjj(ekjkVar2));
                this.e++;
            } else {
                ekjjVar.c++;
                ekjk ekjkVar4 = ekjjVar.b;
                ekjkVar4.e = ekjkVar2;
                ekjkVar2.f = ekjkVar4;
                ekjjVar.b = ekjkVar2;
            }
        } else {
            ekjj ekjjVar2 = (ekjj) this.c.get(obj);
            ekjjVar2.getClass();
            ekjjVar2.c++;
            ekjkVar2.d = ekjkVar.d;
            ekjkVar2.f = ekjkVar.f;
            ekjkVar2.c = ekjkVar;
            ekjkVar2.e = ekjkVar;
            ekjk ekjkVar5 = ekjkVar.f;
            if (ekjkVar5 == null) {
                ekjjVar2.a = ekjkVar2;
            } else {
                ekjkVar5.e = ekjkVar2;
            }
            ekjk ekjkVar6 = ekjkVar.d;
            if (ekjkVar6 == null) {
                this.a = ekjkVar2;
            } else {
                ekjkVar6.c = ekjkVar2;
            }
            ekjkVar.d = ekjkVar2;
            ekjkVar.f = ekjkVar2;
        }
        this.d++;
        return ekjkVar2;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List u() {
        return (List) super.u();
    }

    @Override // defpackage.ekmj
    public final /* synthetic */ Collection c(Object obj) {
        return new ekjd(this, obj);
    }

    public final void e(Object obj) {
        ekjc.k(new ekjm(this, obj));
    }

    public final void f(ekjk ekjkVar) {
        ekjk ekjkVar2 = ekjkVar.d;
        if (ekjkVar2 != null) {
            ekjkVar2.c = ekjkVar.c;
        } else {
            this.a = ekjkVar.c;
        }
        ekjk ekjkVar3 = ekjkVar.c;
        if (ekjkVar3 != null) {
            ekjkVar3.d = ekjkVar2;
        } else {
            this.b = ekjkVar2;
        }
        if (ekjkVar.f == null && ekjkVar.e == null) {
            ekjj ekjjVar = (ekjj) this.c.remove(ekjkVar.a);
            ekjjVar.getClass();
            ekjjVar.c = 0;
            this.e++;
        } else {
            ekjj ekjjVar2 = (ekjj) this.c.get(ekjkVar.a);
            ekjjVar2.getClass();
            ekjjVar2.c--;
            ekjk ekjkVar4 = ekjkVar.f;
            if (ekjkVar4 == null) {
                ekjk ekjkVar5 = ekjkVar.e;
                ekjkVar5.getClass();
                ekjjVar2.a = ekjkVar5;
            } else {
                ekjkVar4.e = ekjkVar.e;
            }
            ekjk ekjkVar6 = ekjkVar.e;
            if (ekjkVar6 == null) {
                ekjkVar4.getClass();
                ekjjVar2.b = ekjkVar4;
            } else {
                ekjkVar6.f = ekjkVar4;
            }
        }
        this.d--;
    }

    @Override // defpackage.ekjo
    /* renamed from: g */
    public final List c(Object obj) {
        return new ekjd(this, obj);
    }

    @Override // defpackage.ekmj
    /* renamed from: h */
    public final List d(Object obj) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ekjz.b(new ekjm(this, obj)));
        e(obj);
        return listUnmodifiableList;
    }

    @Override // defpackage.ekmj
    public final int i() {
        return this.d;
    }

    @Override // defpackage.ekbr
    public final /* synthetic */ Collection j() {
        return new ekje(this);
    }

    @Override // defpackage.ekbr
    public final /* synthetic */ Collection k() {
        return new ekjh(this);
    }

    @Override // defpackage.ekbr
    public final Iterator l() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ekbr
    public final Map o() {
        return new ekmu(this);
    }

    @Override // defpackage.ekbr
    public final Set p() {
        return new ekjf(this);
    }

    @Override // defpackage.ekmj
    public final void q() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        this.e++;
    }

    @Override // defpackage.ekmj
    public final boolean s(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        a(obj, obj2, null);
        return true;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final /* bridge */ /* synthetic */ Collection v() {
        throw null;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean z(Object obj) {
        throw null;
    }

    public ekjn(int i) {
        this.c = new ekdi(i);
    }

    public ekjn(ekmj ekmjVar) {
        this(ekmjVar.x().size());
        C(ekmjVar);
    }
}
