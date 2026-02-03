package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbr implements cqci, cpbn {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static Bitmap c;
    private static Bitmap d;
    private static Bitmap e;
    private static Bitmap f;
    private static Bitmap g;
    private static Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private Bitmap l;
    private final Context m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final Optional q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;

    public cpbr(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.m = context;
        this.n = fcsuVar2;
        this.o = fcsuVar3;
        this.p = fcsuVar;
        this.q = optional;
        this.r = fcsuVar4;
        this.s = fcsuVar5;
        this.t = fcsuVar6;
        this.u = fcsuVar7;
        this.v = fcsuVar8;
        this.w = fcsuVar9;
    }

    public static boolean A(Uri uri) {
        return !t(uri).equals("g");
    }

    public static Uri B(Context context, String str, boolean z, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(context));
        builder.appendPath("s");
        builder.appendQueryParameter("i", str);
        builder.appendQueryParameter("c", String.valueOf(i));
        builder.appendQueryParameter("s", String.valueOf(z));
        builder.appendQueryParameter("g", "false");
        return builder.build();
    }

    public static String C(Uri uri) {
        cqaz.l(uri);
        return cpbs.b(false, uri.getQueryParameter("i"));
    }

    private static int E(float f2, int i) {
        int iRound = Math.round(i * f2);
        if (iRound >= i) {
            return 0;
        }
        return iRound;
    }

    private static Uri F(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(context));
        builder.appendPath("o");
        return builder.build();
    }

    private static Uri G(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(context));
        builder.appendPath("p");
        return builder.build();
    }

    private final Uri H(Uri uri, Uri uri2) {
        if (cqmz.p(uri)) {
            Context context = this.m;
            cqaz.l(uri);
            cqaz.l(uri2);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("content");
            builder.authority(cpbj.a(context));
            builder.appendPath("r");
            builder.appendQueryParameter("m", uri.toString());
            builder.appendQueryParameter("f", uri2.toString());
            return builder.build();
        }
        if (!cqmz.v(uri)) {
            return uri;
        }
        Context context2 = this.m;
        uri2.getClass();
        Uri.Builder builder2 = new Uri.Builder();
        builder2.scheme("content");
        builder2.authority(cpbj.a(context2));
        builder2.appendPath("h");
        builder2.appendQueryParameter("m", uri.toString());
        builder2.appendQueryParameter("f", uri2.toString());
        return builder2.build();
    }

    private static boolean I(boolean z, boolean z2) {
        return z && !z2;
    }

    private final synchronized Bitmap J(Context context, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i3;
        int i4;
        boolean z5 = false;
        if (z3 && !z) {
            z5 = true;
        }
        boolean zI = I(z2, z);
        if (z) {
            bitmap = d;
            bitmap2 = g;
            i3 = R.drawable.quantum_ic_business_white_48;
            i4 = R.drawable.quantum_ic_business_white_24;
        } else if (zI) {
            bitmap = e;
            bitmap2 = h;
            i3 = R.drawable.quantum_ic_report_black_48;
            i4 = R.drawable.quantum_ic_report_black_24;
        } else if (z5) {
            bitmap = this.i;
            bitmap2 = this.k;
            i3 = R.drawable.quantum_ic_do_not_disturb_black_48;
            i4 = R.drawable.quantum_ic_do_not_disturb_black_24;
        } else if (z4) {
            bitmap = this.j;
            bitmap2 = this.l;
            i3 = R.drawable.quantum_ic_sos_black_48;
            i4 = R.drawable.quantum_ic_sos_black_24;
        } else {
            bitmap = c;
            bitmap2 = f;
            i3 = R.drawable.ic_logo_avatar_anonymous_large;
            i4 = R.drawable.ic_logo_avatar_anonymous;
        }
        if (bitmap == null || bitmap2 == null) {
            if (bitmap == null) {
                Resources resources = context.getResources();
                Resources.Theme theme = context.getTheme();
                WeakHashMap weakHashMap = kyy.a;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) resources.getDrawable(i4, theme);
                bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            if (bitmap2 == null) {
                Resources resources2 = context.getResources();
                Resources.Theme theme2 = context.getTheme();
                WeakHashMap weakHashMap2 = kyy.a;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) resources2.getDrawable(i3, theme2);
                bitmap2 = bitmapDrawable2 != null ? bitmapDrawable2.getBitmap() : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            if (z) {
                d = bitmap;
                g = bitmap2;
            } else if (zI) {
                e = bitmap;
                h = bitmap2;
            } else if (z5) {
                this.i = bitmap;
                this.k = bitmap2;
            } else if (z4) {
                this.j = bitmap;
                this.l = bitmap2;
            } else {
                c = bitmap;
                f = bitmap2;
            }
        }
        if (i <= bitmap.getWidth()) {
            if (i2 <= bitmap.getHeight()) {
                return bitmap;
            }
        }
        return bitmap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri K(final android.net.Uri r8, java.lang.CharSequence r9, defpackage.alqm r10, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpbr.K(android.net.Uri, java.lang.CharSequence, alqm, com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor, boolean, boolean, boolean):android.net.Uri");
    }

    public static Uri l(Context context, int i, String str, int i2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(context));
        builder.appendPath("ss");
        builder.appendQueryParameter("si", String.valueOf(i));
        builder.appendQueryParameter("i", str);
        builder.appendQueryParameter("c", String.valueOf(i2));
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static Uri m(Context context) {
        return new Uri.Builder().scheme("content").authority(cpbj.a(context)).appendPath("b").build();
    }

    public static Uri n(Uri uri) {
        cqaz.l(uri);
        String queryParameter = uri.getQueryParameter("f");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri o(Uri uri) {
        cqaz.l(uri);
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri p(Context context, List list) {
        cqaz.l(list);
        cqaz.k(!list.isEmpty());
        if (list.size() == 1) {
            Uri uri = (Uri) list.get(0);
            cqaz.k(y(context, uri));
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(context));
        builder.appendPath("g");
        int iMin = Math.min(list.size(), 4);
        for (int i = 0; i < iMin; i++) {
            Uri uri2 = (Uri) list.get(i);
            cqaz.l(uri2);
            ejwl.l(cqmz.p(uri2) || y(context, uri2) || cqmz.v(uri2));
            builder.appendQueryParameter("p", uri2.toString());
        }
        return builder.build();
    }

    public static OptionalInt q(Uri uri) {
        uri.getClass();
        String queryParameter = uri.getQueryParameter("t");
        return queryParameter == null ? OptionalInt.empty() : OptionalInt.of(Integer.parseInt(queryParameter));
    }

    public static Integer r(Uri uri) {
        String queryParameter;
        cqaz.l(uri);
        if (uri == null || (queryParameter = uri.getQueryParameter("x")) == null) {
            return null;
        }
        return Integer.valueOf(queryParameter);
    }

    public static String s(String str, alqm alqmVar) {
        cczv cczvVar = alvx.a;
        return (alqmVar.x(((Boolean) new alvs().get()).booleanValue()) || alqmVar.D()) ? str : alqmVar.p(((Boolean) new alvs().get()).booleanValue());
    }

    public static String t(Uri uri) {
        return uri == null ? "d" : (String) Collection.EL.stream(uri.getPathSegments()).findFirst().orElse("d");
    }

    public static String u(Uri uri) {
        cqaz.l(uri);
        return cpbs.a(uri.getQueryParameter("i"));
    }

    public static String v(Uri uri) {
        cqaz.l(uri);
        return uri.getQueryParameter("n");
    }

    public static List w(Uri uri) {
        cqaz.l(uri);
        return uri.getQueryParameters("p");
    }

    public static synchronized void x() {
        c = null;
        d = null;
        f = null;
        g = null;
    }

    public static boolean y(Context context, Uri uri) {
        cqaz.l(uri);
        return uri != null && TextUtils.equals("content", uri.getScheme()) && TextUtils.equals(cpbj.a(context), uri.getAuthority());
    }

    public static boolean z(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        if (y(context, uri) || cqmz.n(uri) || cqmz.v(uri) || t(uri).equals("h")) {
            return true;
        }
        if (!byew.a().booleanValue()) {
            if (cqmz.r(uri, byew.a().booleanValue() ? "" : String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.VerifiedSmsBrandLogoFileProvider"))) {
                return true;
            }
        }
        return cqmz.r(uri, String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.RbmBusinessInfoFileProvider"));
    }

    final int D(String str, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5) {
        if (z4 && !z2) {
            return ((crlw) this.o.b()).b.getColor(R.color.block_icon_background_color_m2);
        }
        if (I(z3, z2)) {
            crlw crlwVar = (crlw) this.o.b();
            return crlwVar.c.g() ? crlwVar.b.getColor(R.color.spam_icon_background_color_m2_dark) : crlwVar.b.getColor(R.color.spam_icon_background_color_m2);
        }
        if (z5) {
            crlw crlwVar2 = (crlw) this.o.b();
            return crlwVar2.c.g() ? crlwVar2.b.getColor(R.color.emergency_avatar_background_color_dark) : crlwVar2.b.getColor(R.color.emergency_avatar_background_color);
        }
        if (!z) {
            return !z2 ? ((crlw) this.o.b()).d(str) : num == null ? ((crlw) this.o.b()).h(str).a : num.intValue();
        }
        crlw crlwVar3 = (crlw) this.o.b();
        if (((Boolean) crlv.a.e()).booleanValue()) {
            return crlwVar3.b.getColor(R.color.oneplus_unknown_sender_background);
        }
        return (crlwVar3.c.g() ? crlwVar3.e : crlwVar3.d)[0].getColor(0, 0);
    }

    @Override // defpackage.cpbn
    public final Uri a() {
        return e(null, null, ((alrj) this.r.b()).f(), null);
    }

    @Override // defpackage.cpbn
    public final Uri b(Uri uri, Uri uri2) {
        return H(uri, uri2);
    }

    @Override // defpackage.cpbn
    public final RectF[] c(int i, int i2, int i3) {
        float f2 = i2;
        float f3 = i;
        RectF[] rectFArr = new RectF[i3];
        float f4 = f3 + 0.0f;
        float f5 = f3 / 2.0f;
        float f6 = f2 + 0.0f;
        float f7 = f2 / 2.0f;
        if (i3 == 2) {
            float fSqrt = (float) ((2.0d - Math.sqrt(2.0d)) * f4);
            rectFArr[0] = new RectF(0.0f, 0.0f, fSqrt, fSqrt);
            rectFArr[1] = new RectF(f3 - fSqrt, f2 - fSqrt, f4, f6);
            return rectFArr;
        }
        if (i3 != 3) {
            rectFArr[0] = new RectF(0.0f, 0.0f, f5, f7);
            rectFArr[1] = new RectF(f5, 0.0f, f4, f7);
            rectFArr[2] = new RectF(0.0f, f7, f5, f6);
            rectFArr[3] = new RectF(f5, f7, f4, f6);
            return rectFArr;
        }
        float f8 = f3 / 4.0f;
        float f9 = f2 / 4.0f;
        float fSqrt2 = (f2 - f9) - ((float) (f9 * Math.sqrt(3.0d)));
        rectFArr[0] = new RectF(f8, (fSqrt2 - f9) + 0.0f, 3.0f * f8, fSqrt2 + f9 + 0.0f);
        float f10 = f7 + 0.0f;
        rectFArr[1] = new RectF(0.0f, f10, f5, f6);
        rectFArr[2] = new RectF(f5, f10, f4, f6);
        return rectFArr;
    }

    @Override // defpackage.cpbn
    public final Uri d(CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor) {
        cqaz.l(charSequence);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(cpbj.a(this.m));
        builder.appendPath("l");
        String strValueOf = String.valueOf(charSequence);
        builder.appendQueryParameter("n", strValueOf);
        builder.appendQueryParameter("i", s(strValueOf, alqmVar));
        if (participantColor != null && !participantColor.g()) {
            builder.appendQueryParameter("x", String.valueOf(((crlw) this.o.b()).b()));
        }
        return builder.build();
    }

    @Override // defpackage.cpbn
    public final Uri e(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor) {
        return K(uri, charSequence, alqmVar, participantColor, false, false, false);
    }

    @Override // defpackage.cpbn
    public final Uri f(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3) {
        return K(uri, charSequence, alqmVar, participantColor, z, z2, z3);
    }

    @Override // defpackage.cpbn
    public final Uri g(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3) {
        if (uri != null) {
            fcsu fcsuVar = this.t;
            if (((drjk) fcsuVar.b()).b(uri)) {
                try {
                    uri = ((drjk) fcsuVar.b()).a((int) this.m.getResources().getDimension(R.dimen.avatar_display_size), uri);
                } catch (drji e2) {
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e2)).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "updateFifeImageSize", (char) 931, "AvatarUriUtilImpl.java")).q("Unexpected InvalidUrlException thrown by fifeImageUrlUtil");
                }
            } else {
                ekrg ekrgVar = cqmz.a;
                String string = uri.toString();
                Uri uri2 = cqmz.c;
                if (string.startsWith(uri2.toString())) {
                    String lastPathSegment = uri.getLastPathSegment();
                    lastPathSegment.getClass();
                    Uri uri3 = Uri.parse(lastPathSegment);
                    String queryParameter = uri3.getQueryParameter("account_name");
                    uri = uri2.buildUpon().appendPath(new Uri.Builder().scheme(uri3.getScheme()).authority(uri3.getAuthority()).path(uri3.getPath()).appendQueryParameter("account_name", queryParameter).appendQueryParameter("lookup", uri3.getQueryParameter("lookup")).build().toString()).encodedQuery(uri.getQuery()).build();
                } else if (cqmz.r(uri, "com.android.contacts") && uri.getPathSegments().contains("photo")) {
                    List<String> pathSegments = uri.getPathSegments();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < pathSegments.size(); i++) {
                        sb.append('/');
                        if (pathSegments.get(i).equals("photo")) {
                            sb.append("display_photo");
                        } else {
                            sb.append(pathSegments.get(i));
                        }
                    }
                    uri = uri.buildUpon().path(sb.toString()).build();
                } else if (cqmu.c(uri, "com.google.android.gms.people.gal.provider") && uri.getQueryParameterNames().contains("sz")) {
                    Uri.Builder builderPath = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
                    for (String str : uri.getQueryParameterNames()) {
                        if (!str.equals("sz")) {
                            builderPath.appendQueryParameter(str, uri.getQueryParameter(str));
                        }
                    }
                    uri = builderPath.build();
                }
            }
        } else {
            uri = null;
        }
        return K(uri, charSequence, alqmVar, participantColor, z, z2, z3);
    }

    @Override // defpackage.cpbn
    public final Bitmap h(String str, int i, int i2, boolean z, boolean z2, Integer num, cpbm cpbmVar, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        int iE;
        int iE2 = 0;
        if (!z4 || z) {
            z6 = z3;
            z7 = false;
        } else {
            z6 = z3;
            z7 = true;
        }
        boolean zI = I(z6, z);
        if (!zI && !z7 && !z && !z5) {
            this.q.isPresent();
        }
        if (!zI && !z7 && !z && !z5 && !((Boolean) crlv.a.e()).booleanValue() && ((cogv) this.u.b()).b()) {
            Bitmap bitmapG = cpbmVar.g(i, i2, 0);
            Context contextA = ((cogt) ((cpbu) this.v.b()).a.b()).a();
            int iD = eehg.d(contextA, R.attr.colorSurfaceContainer, "CoolRanchDefaultAvatarDrawable");
            int iD2 = eehg.d(contextA, R.attr.colorOutline, "CoolRanchDefaultAvatarDrawable");
            Drawable drawable = contextA.getDrawable(R.drawable.gs_person_fill1rond100_vd_48);
            drawable.getClass();
            cpbt cpbtVar = new cpbt(iD, drawable, iD2);
            cpbtVar.setBounds(0, 0, i, i2);
            cpbtVar.draw(new Canvas(bitmapG));
            return bitmapG;
        }
        Bitmap bitmapG2 = cpbmVar.g(i, i2, D(str, z2, z, num, zI, z7, z5));
        Canvas canvas = new Canvas(bitmapG2);
        Bitmap bitmapJ = J(this.m, z, i, i2, zI, z7, z5);
        Paint paint = new Paint(1);
        if (z) {
            paint.setColorFilter(new PorterDuffColorFilter(((crlw) this.o.b()).c(), PorterDuff.Mode.SRC_IN));
            iE2 = E(0.17f, i);
            iE = E(0.17f, i2);
        } else if (z7) {
            crlw crlwVar = (crlw) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(crlwVar.c.g() ? crlwVar.b.getColor(R.color.block_icon_foreground_color_m2_dark) : crlwVar.b.getColor(R.color.block_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            iE2 = E(0.0f, i);
            iE = E(0.0f, i2);
        } else if (zI) {
            crlw crlwVar2 = (crlw) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(crlwVar2.c.g() ? crlwVar2.b.getColor(R.color.spam_icon_foreground_color_m2_dark) : crlwVar2.b.getColor(R.color.spam_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            iE2 = E(0.14f, i);
            iE = E(0.14f, i2);
        } else if (z5) {
            crlw crlwVar3 = (crlw) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(crlwVar3.c.g() ? crlwVar3.b.getColor(R.color.emergency_avatar_foreground_color_dark) : crlwVar3.b.getColor(R.color.emergency_avatar_foreground_color), PorterDuff.Mode.SRC_IN));
            iE2 = E(0.2f, i);
            iE = E(0.2f, i2);
        } else {
            paint.setColorFilter(new PorterDuffColorFilter(((crlw) this.o.b()).c(), PorterDuff.Mode.SRC_IN));
            iE = 0;
        }
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmapJ.getWidth(), bitmapJ.getHeight()), new RectF(iE2, iE, i - iE2, i2 - iE), Matrix.ScaleToFit.FILL);
        canvas.drawBitmap(bitmapJ, matrix, paint);
        return bitmapG2;
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpbn
    public final Bitmap j(String str, String str2, int i, int i2, Integer num, cpbm cpbmVar, boolean z, OptionalInt optionalInt) {
        int iD;
        int iD2;
        int iMin = Math.min(i, i2);
        if (!z) {
            this.q.isPresent();
        }
        if (z || ((Boolean) crlv.a.e()).booleanValue() || !((cogv) this.u.b()).b()) {
            Bitmap bitmapG = cpbmVar.g(i, i2, D(str2, false, z, num, false, false, false));
            Context context = this.m;
            Resources resources = context.getResources();
            Paint paint = new Paint(1);
            paint.setTypeface(cpdu.a(context));
            paint.setColor(optionalInt.orElse(((crlw) this.o.b()).c()));
            paint.setTextSize(resources.getFraction(R.fraction.letter_to_tile_ratio, 1, 1) * iMin);
            String upperCase = str.substring(0, 1).toUpperCase(craf.c(context));
            paint.getTextBounds(upperCase, 0, 1, new Rect());
            new Canvas(bitmapG).drawText(upperCase, (i / 2.0f) - r3.centerX(), (i2 / 2.0f) - r3.centerY(), paint);
            return bitmapG;
        }
        Bitmap bitmapG2 = cpbmVar.g(i, i2, 0);
        cpbx cpbxVar = (cpbx) this.w.b();
        Context contextA = ((cogt) cpbxVar.e.b()).a();
        cogv cogvVar = cpbxVar.f;
        cogu coguVarA = cogvVar.a();
        int iOrdinal = coguVarA.ordinal();
        if (iOrdinal == 1) {
            iD = eehg.d(contextA, R.attr.colorTertiaryFixed, "CoolRanchLetterAvatarDrawableFactory");
        } else if (iOrdinal == 2) {
            ekgb ekgbVar = cpbx.a;
            iD = contextA.getColor(((Integer) ekgbVar.get(cpbx.a(str2, ((ekoe) ekgbVar).c))).intValue());
        } else {
            if (iOrdinal != 3) {
                throw new IllegalStateException("Unsupported color palette: ".concat(String.valueOf(String.valueOf(coguVarA))));
            }
            ekgb ekgbVar2 = cpbx.c;
            iD = contextA.getColor(((Integer) ekgbVar2.get(cpbx.a(str2, ((ekoe) ekgbVar2).c))).intValue());
        }
        cogu coguVarA2 = cogvVar.a();
        int iOrdinal2 = coguVarA2.ordinal();
        if (iOrdinal2 == 1) {
            iD2 = eehg.d(contextA, R.attr.colorOnTertiaryFixed, "CoolRanchLetterAvatarDrawableFactory");
        } else if (iOrdinal2 == 2) {
            ekgb ekgbVar3 = cpbx.b;
            iD2 = contextA.getColor(((Integer) ekgbVar3.get(cpbx.a(str2, ((ekoe) ekgbVar3).c))).intValue());
        } else {
            if (iOrdinal2 != 3) {
                throw new IllegalStateException("Unsupported color palette: ".concat(String.valueOf(String.valueOf(coguVarA2))));
            }
            ekgb ekgbVar4 = cpbx.d;
            iD2 = contextA.getColor(((Integer) ekgbVar4.get(cpbx.a(str2, ((ekoe) ekgbVar4).c))).intValue());
        }
        cpbv cpbvVar = new cpbv(iD, new cpbw(contextA, str.substring(0, 1), iD2));
        cpbvVar.setBounds(0, 0, i, i2);
        cpbvVar.draw(new Canvas(bitmapG2));
        return bitmapG2;
    }

    @Override // defpackage.cpbn
    public final Uri k(bvdz bvdzVar) {
        Uri.Builder builderScheme = new Uri.Builder().scheme("content");
        Context context = this.m;
        Uri.Builder builderAppendPath = builderScheme.authority(cpbj.a(context)).appendPath("z");
        fcsu fcsuVar = this.p;
        Uri uriBuild = builderAppendPath.appendQueryParameter("x", String.valueOf(context.getColor(true != ((cpch) fcsuVar.b()).g() ? R.color.verified_sms_business_color_light : R.color.verified_sms_business_color_dark))).appendQueryParameter("v", Boolean.TRUE.toString()).build();
        if (bvdzVar == bvdz.VERIFICATION_IN_PROGRESS || bvdzVar == bvdz.VERIFICATION_NA || bvdzVar != bvdz.VERIFICATION_UNVERIFIED) {
            return uriBuild;
        }
        return new Uri.Builder().scheme("content").authority(cpbj.a(context)).appendPath("u").appendQueryParameter("t", String.valueOf(context.getColor(true != ((cpch) fcsuVar.b()).g() ? R.color.unverified_sms_business_foreground_color_light : R.color.unverified_sms_business_foreground_color_dark))).appendQueryParameter("x", String.valueOf(context.getColor(true != ((cpch) fcsuVar.b()).g() ? R.color.unverified_sms_business_background_color_light : R.color.unverified_sms_business_background_color_dark))).appendQueryParameter("v", Boolean.TRUE.toString()).appendQueryParameter("vsms_autogen", String.valueOf(((Boolean) cssx.a.e()).toString()).concat(String.valueOf(UUID.randomUUID().toString()))).build();
    }
}
