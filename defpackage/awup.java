package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awup implements Comparator {
    final /* synthetic */ awye a;

    public awup(awye awyeVar) {
        this.a = awyeVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        awye awyeVar = this.a;
        return fcxl.a(Boolean.valueOf(!awyeVar.a.contains(((awxn) obj).b())), Boolean.valueOf(!awyeVar.a.contains(((awxn) obj2).b())));
    }
}
