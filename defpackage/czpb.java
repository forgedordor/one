package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpb implements czov {
    public final Context a;
    public final ebtb b;
    private final eosc c;
    private final eosd d;
    private final ehrb e;

    public czpb(Context context, ebtb ebtbVar, eosc eoscVar, eosd eosdVar, ehrb ehrbVar) {
        this.b = ebtbVar;
        this.a = context;
        this.c = eoscVar;
        this.d = eosdVar;
        this.e = ehrbVar;
    }

    @Override // defpackage.czov
    public final eiju a(Uri uri, final GLTextureView gLTextureView) {
        return eiju.g(rdo.a(this.e.a().i(uri))).i(new eooz() { // from class: czow
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Bitmap bitmap = (Bitmap) obj;
                final czpb czpbVar = this.a;
                final GLTextureView gLTextureView2 = gLTextureView;
                return kol.a(new koi() { // from class: czpa
                    @Override // defpackage.koi
                    public final Object a(final kog kogVar) {
                        final czpb czpbVar2 = czpbVar;
                        final Bitmap bitmap2 = bitmap;
                        Runnable runnable = new Runnable() { // from class: czoz
                            @Override // java.lang.Runnable
                            public final void run() {
                                final Bitmap bitmap3 = bitmap2;
                                final kog kogVar2 = kogVar;
                                ebtj ebtjVarB = czpbVar2.b.b();
                                int width = bitmap3.getWidth();
                                int height = bitmap3.getHeight();
                                fdap fdapVar = new fdap() { // from class: czoy
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj2) {
                                        Bitmap bitmap4 = bitmap3;
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap4.getWidth(), bitmap4.getHeight(), bitmap4.getConfig());
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.drawBitmap(bitmap4, new Matrix(), null);
                                        canvas.drawBitmap((Bitmap) obj2, 0.0f, 0.0f, (Paint) null);
                                        kogVar2.b(bitmapCreateBitmap);
                                        return fctx.a;
                                    }
                                };
                                ExpressiveTextContext expressiveTextContext = ebtjVarB.a;
                                if (expressiveTextContext.p()) {
                                    int iA = ebtjVarB.c;
                                    if (iA < 0) {
                                        iA = expressiveTextContext.a();
                                        ebtjVarB.c = iA;
                                    }
                                    if (width > iA && width > height) {
                                        height = (int) ((height * iA) / width);
                                        width = iA;
                                    } else if (height > iA) {
                                        width = (int) ((width * iA) / height);
                                        height = iA;
                                    }
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.getClass();
                                    expressiveTextContext.u(bitmapCreateBitmap);
                                    fdapVar.invoke(bitmapCreateBitmap);
                                }
                            }
                        };
                        ebtq ebtqVar = gLTextureView2.c;
                        ebtr ebtrVar = GLTextureView.a;
                        synchronized (ebtrVar) {
                            ebtqVar.j.add(runnable);
                            ebtrVar.notifyAll();
                        }
                        return "ExpressiveText.onExportSelected and merge operation.";
                    }
                });
            }
        }, this.d).h(new ejvr() { // from class: czox
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                Context context = this.a.a;
                Bitmap bitmap = (Bitmap) obj;
                Uri uriD = bxlf.d("jpg", context);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(bxlf.h(uriD, context));
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return uriD;
                    } finally {
                    }
                } catch (IOException unused) {
                    return Uri.EMPTY;
                }
            }
        }, this.c);
    }
}
