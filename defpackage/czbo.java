package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbo implements czbg {
    public static final Uri[] a = {MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI};
    public final eosc b;
    public final egxv c;
    public final batu d;
    public final crma e;
    public final cogw f;
    public final boolean g;
    public final boolean h = ((Boolean) ccze.a.e()).booleanValue();
    public final Function i;

    public czbo(Context context, eosc eoscVar, lvj lvjVar, egxv egxvVar, eigp eigpVar, egzh egzhVar, batu batuVar, crma crmaVar, cogw cogwVar, final czbf czbfVar) {
        this.b = eoscVar;
        this.c = egxvVar;
        this.d = batuVar;
        this.e = crmaVar;
        this.f = cogwVar;
        this.g = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        this.i = new Function() { // from class: czbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                Uri[] uriArr = czbo.a;
                return le.z(cursor.getString(cursor.getColumnIndexOrThrow("mime_type"))) ? czbfVar.a(cursor) : new czbc(cursor);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        lvjVar.P().c(new czbk(egxvVar, new czbj(eigpVar, eoscVar, egzhVar)));
    }

    @Override // defpackage.czbg
    public final egyi a() {
        return new czbn(this);
    }
}
