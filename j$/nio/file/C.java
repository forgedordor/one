package j$.nio.file;

import j$.nio.file.attribute.C0004a;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.util.C0037f;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class C {
    public static final B a = new B(0, "OVERFLOW", Object.class);
    public static final B b;
    public static final B c;
    public static final B d;

    static {
        Class<Path> cls = Path.class;
        b = new B(0, "ENTRY_CREATE", cls);
        int i = 0;
        c = new B(i, "ENTRY_DELETE", cls);
        d = new B(i, "ENTRY_MODIFY", cls);
    }

    public static /* synthetic */ StandardOpenOption a(A a2) {
        if (a2 == null) {
            return null;
        }
        return a2 == A.READ ? StandardOpenOption.READ : a2 == A.WRITE ? StandardOpenOption.WRITE : a2 == A.APPEND ? StandardOpenOption.APPEND : a2 == A.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : a2 == A.CREATE ? StandardOpenOption.CREATE : a2 == A.CREATE_NEW ? StandardOpenOption.CREATE_NEW : a2 == A.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : a2 == A.SPARSE ? StandardOpenOption.SPARSE : a2 == A.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? s.f((Path) obj) : q.m(obj) ? r.f(q.d(obj)) : obj;
    }

    public static Class c(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0008e.class;
        }
        if (cls == InterfaceC0008e.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.y.class;
        }
        if (cls == j$.nio.file.attribute.y.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.u.class;
        }
        if (cls == j$.nio.file.attribute.u.class) {
            return j$.adapter.b.B();
        }
        if (cls == j$.nio.file.attribute.i.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return j$.nio.file.attribute.i.class;
        }
        if (cls == j$.nio.file.attribute.B.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.B.class;
        }
        if (cls == C0004a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0004a.class;
        }
        C0037f.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return j$.nio.file.attribute.h.class;
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.z.class;
        }
        if (cls == j$.nio.file.attribute.z.class) {
            return j$.adapter.b.r();
        }
        if (cls == j$.nio.file.attribute.j.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return j$.nio.file.attribute.j.class;
        }
        C0037f.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map e(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, f(map.get(str)));
        }
        return map2;
    }

    public static Object f(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.desugar.sun.nio.fs.g.z(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0037f.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.w)) {
            return obj;
        }
        try {
            return j$.desugar.sun.nio.fs.g.E((j$.nio.file.attribute.w) obj);
        } catch (ClassCastException e2) {
            C0037f.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set g(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof n) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(m.a((n) it.next()));
                } catch (ClassCastException e) {
                    C0037f.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.x(next)) {
                C0037f.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(l.a(j$.adapter.b.e(it2.next())));
                } catch (ClassCastException e2) {
                    C0037f.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set h(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.A) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.A a2 = (j$.nio.file.attribute.A) it.next();
                    hashSet.add(a2 == null ? null : a2 == j$.nio.file.attribute.A.OWNER_READ ? PosixFilePermission.OWNER_READ : a2 == j$.nio.file.attribute.A.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : a2 == j$.nio.file.attribute.A.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : a2 == j$.nio.file.attribute.A.GROUP_READ ? PosixFilePermission.GROUP_READ : a2 == j$.nio.file.attribute.A.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : a2 == j$.nio.file.attribute.A.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : a2 == j$.nio.file.attribute.A.OTHERS_READ ? PosixFilePermission.OTHERS_READ : a2 == j$.nio.file.attribute.A.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0037f.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.t(next)) {
                C0037f.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermissionJ = j$.adapter.b.j(it2.next());
                    hashSet.add(posixFilePermissionJ == null ? null : posixFilePermissionJ == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.A.OWNER_READ : posixFilePermissionJ == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.A.OWNER_WRITE : posixFilePermissionJ == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.A.OWNER_EXECUTE : posixFilePermissionJ == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.A.GROUP_READ : posixFilePermissionJ == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.A.GROUP_WRITE : posixFilePermissionJ == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.A.GROUP_EXECUTE : posixFilePermissionJ == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.A.OTHERS_READ : posixFilePermissionJ == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.A.OTHERS_WRITE : j$.nio.file.attribute.A.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C0037f.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static /* synthetic */ k[] i(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        k[] kVarArr = new k[length];
        for (int i = 0; i < length; i++) {
            kVarArr[i] = linkOptionArr[i] == null ? null : k.NOFOLLOW_LINKS;
        }
        return kVarArr;
    }

    public static F[] j(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        F[] fArr = new F[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            fArr[i] = kind == null ? null : kind == StandardWatchEventKinds.ENTRY_CREATE ? b : kind == StandardWatchEventKinds.ENTRY_DELETE ? c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? d : kind == StandardWatchEventKinds.OVERFLOW ? a : kind instanceof E ? ((E) kind).a : new D(kind);
        }
        return fArr;
    }

    public static /* synthetic */ LinkOption[] k(k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        int length = kVarArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = kVarArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static WatchEvent.Kind[] l(F[] fArr) {
        if (fArr == null) {
            return null;
        }
        int length = fArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            F f = fArr[i];
            kindArr[i] = f == null ? null : f == b ? StandardWatchEventKinds.ENTRY_CREATE : f == c ? StandardWatchEventKinds.ENTRY_DELETE : f == d ? StandardWatchEventKinds.ENTRY_MODIFY : f == a ? StandardWatchEventKinds.OVERFLOW : f instanceof D ? ((D) f).a : new E(f);
        }
        return kindArr;
    }
}
