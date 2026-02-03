package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmyj extends dqtb {
    public bmyj() {
        super("cms_restore_dependency_cache_table", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmyi b() {
        return new bmyi(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = bmyr.a;
        this.b = new bmyp((bmyq) function.apply(new bmyq()));
    }
}
