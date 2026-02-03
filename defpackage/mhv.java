package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhv implements mhl {
    private final Context a;
    private final List b = new ArrayList();
    private final mhl c;
    private mhl d;
    private mhl e;
    private mhl f;
    private mhl g;
    private mhl h;
    private mhl i;
    private mhl j;
    private mhl k;

    public mhv(Context context, mhl mhlVar) {
        this.a = context.getApplicationContext();
        this.c = mhlVar;
    }

    private final mhl g() {
        if (this.e == null) {
            mhe mheVar = new mhe(this.a);
            this.e = mheVar;
            h(mheVar);
        }
        return this.e;
    }

    private final void h(mhl mhlVar) {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            mhlVar.f((min) list.get(i));
            i++;
        }
    }

    private static final void i(mhl mhlVar, min minVar) {
        if (mhlVar != null) {
            mhlVar.f(minVar);
        }
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) {
        mhl mhlVar = this.k;
        mee.f(mhlVar);
        return mhlVar.a(bArr, i, i2);
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) {
        mhl mhlVar;
        mee.c(this.k == null);
        Uri uri = mhtVar.a;
        String scheme = uri.getScheme();
        String str = mgb.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    mid midVar = new mid();
                    this.d = midVar;
                    h(midVar);
                }
                this.k = this.d;
            } else {
                this.k = g();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                mhi mhiVar = new mhi(this.a);
                this.f = mhiVar;
                h(mhiVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    mhl mhlVar2 = (mhl) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = mhlVar2;
                    h(mhlVar2);
                } catch (ClassNotFoundException unused) {
                    mff.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                mip mipVar = new mip();
                this.h = mipVar;
                h(mipVar);
            }
            this.k = this.h;
        } else if (GroupManagementRequest.DATA_TAG.equals(scheme)) {
            if (this.i == null) {
                mhj mhjVar = new mhj();
                this.i = mhjVar;
                h(mhjVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    mil milVar = new mil(this.a);
                    this.j = milVar;
                    h(milVar);
                }
                mhlVar = this.j;
            } else {
                mhlVar = this.c;
            }
            this.k = mhlVar;
        }
        return this.k.b(mhtVar);
    }

    @Override // defpackage.mhl
    public final Uri c() {
        mhl mhlVar = this.k;
        if (mhlVar == null) {
            return null;
        }
        return mhlVar.c();
    }

    @Override // defpackage.mhl
    public final void d() {
        mhl mhlVar = this.k;
        if (mhlVar != null) {
            try {
                mhlVar.d();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.mhl
    public final Map e() {
        mhl mhlVar = this.k;
        return mhlVar == null ? Collections.EMPTY_MAP : mhlVar.e();
    }

    @Override // defpackage.mhl
    public final void f(min minVar) {
        mee.f(minVar);
        this.c.f(minVar);
        this.b.add(minVar);
        i(this.d, minVar);
        i(this.e, minVar);
        i(this.f, minVar);
        i(this.g, minVar);
        i(this.h, minVar);
        i(this.i, minVar);
        i(this.j, minVar);
    }
}
