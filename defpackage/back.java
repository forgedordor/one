package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class back extends lzn implements bacg {
    private final String j;
    private final String k;
    private final cqiz l;

    public back(Context context, cqiz cqizVar, String str) {
        super(context);
        this.j = "ditto_contacts_loader";
        this.k = str;
        this.l = cqizVar;
        k();
    }

    @Override // defpackage.lzp
    protected final void m() {
        if (q()) {
            f();
        }
    }

    @Override // defpackage.lzp
    protected final void n() {
        h();
    }

    @Override // defpackage.lzn
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Cursor a() {
        String str = this.k;
        Cursor cursorA = TextUtils.isEmpty(str) ? this.l.e().a() : ((cqip) this.l.i(str, null)).a;
        if (cursorA == null) {
            return null;
        }
        return cqiz.a(cursorA);
    }

    @Override // defpackage.bacg
    public final String t() {
        return this.j;
    }
}
