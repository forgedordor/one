package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmv extends ekap {
    private static final long serialVersionUID = 0;
    transient ejxr c;

    public ekmv(Map map, ejxr ejxrVar) {
        super(map);
        this.c = ejxrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.c = (ejxr) object;
        Object object2 = objectInputStream.readObject();
        object2.getClass();
        r((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((ekbi) this).a);
    }

    @Override // defpackage.ekap, defpackage.ekbi
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.get();
    }

    @Override // defpackage.ekbi, defpackage.ekbr
    public final Map o() {
        Map map = ((ekbi) this).a;
        return map instanceof NavigableMap ? new ekay(this, (NavigableMap) map) : map instanceof SortedMap ? new ekbb(this, (SortedMap) map) : new ekau(this, map);
    }

    @Override // defpackage.ekbi, defpackage.ekbr
    public final Set p() {
        Map map = ((ekbi) this).a;
        return map instanceof NavigableMap ? new ekaz(this, (NavigableMap) map) : map instanceof SortedMap ? new ekbc(this, (SortedMap) map) : new ekax(this, map);
    }
}
