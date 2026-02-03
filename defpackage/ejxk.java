package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxk {
    public final ejvf a;
    public final boolean b;
    public final ejxj c;
    public final int d;

    public ejxk(ejxj ejxjVar, boolean z, ejvf ejvfVar, int i) {
        this.c = ejxjVar;
        this.b = z;
        this.a = ejvfVar;
        this.d = i;
    }

    public static ejxk b(char c) {
        return c(new ejuv(c));
    }

    public static ejxk c(final ejvf ejvfVar) {
        return new ejxk(new ejxj() { // from class: ejxb
            @Override // defpackage.ejxj
            public final Iterator a(ejxk ejxkVar, CharSequence charSequence) {
                return new ejxd(ejxkVar, charSequence, ejvfVar);
            }
        });
    }

    public static ejxk d(final String str) {
        ejwl.b(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new ejxk(new ejxj() { // from class: ejxa
            @Override // defpackage.ejxj
            public final Iterator a(ejxk ejxkVar, CharSequence charSequence) {
                return new ejxe(ejxkVar, charSequence, str);
            }
        });
    }

    public static ejxk e(String str) {
        final ejvx ejvxVar = new ejvx(Pattern.compile(str));
        ejwl.f(!((ejvw) ejvxVar.a("")).a.matches(), "The pattern may not match the empty string: %s", ejvxVar);
        return new ejxk(new ejxj() { // from class: ejxc
            @Override // defpackage.ejxj
            public final Iterator a(ejxk ejxkVar, CharSequence charSequence) {
                return new ejxf(ejxkVar, charSequence, ejvxVar.a(charSequence));
            }
        });
    }

    public final ejxk a() {
        return new ejxk(this.c, true, this.a, this.d);
    }

    public final ejxk f() {
        ejvf ejvfVar = ejve.b;
        ejvfVar.getClass();
        return new ejxk(this.c, this.b, ejvfVar, this.d);
    }

    public final Iterable g(CharSequence charSequence) {
        charSequence.getClass();
        return new ejxg(this, charSequence);
    }

    public final Iterator h(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List i(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add((String) itH.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private ejxk(ejxj ejxjVar) {
        this(ejxjVar, false, ejvc.a, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
