package defpackage;

import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.speech.SpeechRecognizer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swt extends fcyz implements fdat {
    final /* synthetic */ swv a;
    final /* synthetic */ fdoa b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swt(fcxy fcxyVar, swv swvVar, fdoa fdoaVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, String str) {
        super(2, fcxyVar);
        this.a = swvVar;
        this.b = fdoaVar;
        this.c = parcelFileDescriptor;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((swt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        swv swvVar = this.a;
        Object obj2 = ((Optional) swvVar.e.b()).get();
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) obj2;
        Context context = swvVar.a;
        speechRecognizer.setRecognitionListener(new swo(context, this.b));
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        int i = this.d;
        int i2 = this.e;
        Intent intentA = sww.a(context);
        if (laa.b()) {
            intentA.putExtra("android.speech.extra.AUDIO_SOURCE", parcelFileDescriptor);
            intentA.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", i);
            intentA.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", i2);
        } else {
            Uri uriB = bxli.b(context, ContentUris.appendId(new Uri.Builder().scheme("content").authority("com.google.android.apps.messaging.shared.datamodel.provider.AudioProxyProviderUtil"), parcelFileDescriptor.getFd()).build(), "audio/raw", "audio/raw", 0L);
            context.grantUriPermission(((ComponentName) ((Optional) swvVar.d.b()).get()).getPackageName(), uriB, 1);
            uriB.getClass();
            intentA.putExtra("com.google.recognition.extra.AUDIO_SOURCE", uriB);
            intentA.putExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", i);
            intentA.putExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", i2);
        }
        intentA.putExtra("android.speech.extra.LANGUAGE", this.f);
        speechRecognizer.startListening(intentA);
        return obj2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        swt swtVar = new swt(fcxyVar, this.a, this.b, this.c, this.d, this.e, this.f);
        swtVar.g = obj;
        return swtVar;
    }
}
