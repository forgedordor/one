package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lcv implements lcu {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public lcv(lcs lcsVar) {
        ClipData clipData = lcsVar.a;
        lcg.i(clipData);
        this.a = clipData;
        int i = lcsVar.b;
        lcg.f(i, 0, 5, "source");
        this.b = i;
        int i2 = lcsVar.c;
        if ((i2 & 1) == i2) {
            this.c = i2;
            this.d = lcsVar.d;
            this.e = lcsVar.e;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // defpackage.lcu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.lcu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.lcu
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.lcu
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.lcu
    public final Bundle e() {
        return this.e;
    }

    @Override // defpackage.lcu
    public final ContentInfo f() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        Uri uri = this.d;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
