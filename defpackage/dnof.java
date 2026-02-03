package defpackage;

import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnof extends fcyz implements fdat {
    final /* synthetic */ dnog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnof(dnog dnogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnof) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Toast toastMakeText = Toast.makeText(this.a.a, R.string.emoji_search_unavailable_try_later, 1);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnof(this.a, fcxyVar);
    }
}
