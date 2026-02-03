package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmnf extends dqtb {
    public bmnf() {
        super("cms_backup_dependency_cache_table", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmne b() {
        return new bmne(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = bmnn.a;
        this.b = new bmnl((bmnm) function.apply(new bmnm()));
    }
}
