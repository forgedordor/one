package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Icon;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbag extends fcyz implements fdap {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dbai e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbag(dbai dbaiVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.e = dbaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objCreateWithResource;
        String str;
        String str2;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            Object obj2 = this.c;
            Object obj3 = this.b;
            objCreateWithResource = this.a;
            fctl.b(obj);
            str = obj2;
            str2 = obj3;
        } else {
            fctl.b(obj);
            dbai dbaiVar = this.e;
            Context context = dbaiVar.a;
            objCreateWithResource = Icon.createWithResource(context, R.drawable.gs_pause_vd_theme_24);
            String string = context.getString(R.string.youtube_pause);
            String string2 = context.getString(R.string.youtube_pause_content_description);
            this.a = objCreateWithResource;
            this.b = string;
            this.c = string2;
            this.d = 1;
            obj = dbaiVar.a(2, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            str = string2;
            str2 = string;
        }
        return new RemoteAction((Icon) objCreateWithResource, str2, str, (PendingIntent) obj);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbag(this.e, (fcxy) obj).b(fctx.a);
    }
}
