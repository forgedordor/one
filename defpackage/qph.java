package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qph implements qpi, qpf {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final qtt e;

    public qph(qtt qttVar) {
        this.e = qttVar;
    }

    private final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            qpi qpiVar = (qpi) list.get(size);
            if (qpiVar instanceof qoz) {
                qoz qozVar = (qoz) qpiVar;
                List listJ = qozVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((qpi) listJ.get(size2)).i();
                        pathI.transform(qozVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(qpiVar.i());
            }
        }
        qpi qpiVar2 = (qpi) list.get(0);
        if (qpiVar2 instanceof qoz) {
            qoz qozVar2 = (qoz) qpiVar2;
            List listJ2 = qozVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                Path pathI2 = ((qpi) listJ2.get(i)).i();
                pathI2.transform(qozVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(qpiVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((qpi) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        throw null;
    }

    @Override // defpackage.qpf
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            qoy qoyVar = (qoy) listIterator.previous();
            if (qoyVar instanceof qpi) {
                this.d.add((qpi) qoyVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.qpi
    public final Path i() {
        Path path = this.c;
        path.reset();
        qtt qttVar = this.e;
        if (!qttVar.a) {
            int i = qttVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    List list = this.d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((qpi) list.get(i3)).i());
                    i3++;
                }
            } else {
                if (i2 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i2 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i2 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i2 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
