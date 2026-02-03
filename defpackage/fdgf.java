package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdgf extends fcub implements Collection, java.util.Collection, fdcn {
    final /* synthetic */ fdgg a;

    public fdgf(fdgg fdggVar) {
        this.a = fdggVar;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    public final fdgc b(int i) {
        Matcher matcher = this.a.a;
        fddq fddqVarR = fddu.r(matcher.start(i), matcher.end(i));
        if (fddqVarR.f().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new fdgc(strGroup, fddqVarR);
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof fdgc)) {
            return super.contains((fdgc) obj);
        }
        return false;
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<fdgc> iterator() {
        return new fdft((fdfu) fdey.j(fcva.ax(fcva.k(this)), new fdap() { // from class: fdge
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return this.a.b(((Integer) obj).intValue());
            }
        }));
    }
}
