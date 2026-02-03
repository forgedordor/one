package com.google.chat.smartmessaging.smartreply.android.models.mediapipe;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.ProtoUtil;
import defpackage.ejmx;
import defpackage.ejmz;
import defpackage.ejne;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.euyl;
import defpackage.euyq;
import defpackage.euyu;
import defpackage.euyw;
import defpackage.euza;
import defpackage.euzb;
import defpackage.euze;
import defpackage.euzf;
import defpackage.euzg;
import defpackage.euzo;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TextClassifier implements AutoCloseable, euzb {
    private static final List a = DesugarCollections.unmodifiableList(Arrays.asList("TEXT:text_in"));
    private static final List b = DesugarCollections.unmodifiableList(Arrays.asList("CLASSIFICATIONS:classifications_out"));
    private static final ekrg c = ekrg.c("com/google/chat/smartmessaging/smartreply/android/models/mediapipe/TextClassifier");
    private final euzo d;

    private TextClassifier(euzo euzoVar) {
        this.d = euzoVar;
    }

    public static TextClassifier a(Context context, File file) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        try {
            euyw euywVarF = euza.f();
            ((euyq) euywVarF).a = Optional.of(Integer.valueOf(parcelFileDescriptorOpen.getFd()));
            euza euzaVarC = euywVarF.c();
            Optional optionalEmpty = Optional.empty();
            Optional optionalEmpty2 = Optional.empty();
            Optional optionalEmpty3 = Optional.empty();
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            if (ekgbVar == null) {
                throw new NullPointerException("Null categoryAllowlist");
            }
            ejmx ejmxVar = new ejmx(euzaVarC, optionalEmpty, optionalEmpty2, optionalEmpty3, ekgbVar, ekgbVar);
            ejmxVar.a.isPresent();
            if (!ejmxVar.b.isEmpty() && !ejmxVar.c.isEmpty()) {
                throw new IllegalArgumentException("Category allowlist and denylist are mutually exclusive.");
            }
            ProtoUtil.b(euyl.class, "mediapipe.tasks.components.containers.proto.ClassificationResult");
            euze euzeVar = new euze();
            euzeVar.a = new ejmz();
            euzf euzfVarH = euzg.h();
            euzfVarH.d("TextClassifier");
            ((euyu) euzfVarH).b = "mediapipe.tasks.text.text_classifier.TextClassifierGraph";
            euzfVarH.b(a);
            euzfVarH.c(b);
            ((euyu) euzfVarH).c = ejmxVar;
            euzfVarH.e();
            TextClassifier textClassifier = new TextClassifier(euzo.b(context, euzfVarH.f(), euzeVar));
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return textClassifier;
        } catch (Throwable th) {
            if (parcelFileDescriptorOpen == null) {
                throw th;
            }
            try {
                parcelFileDescriptorOpen.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final ejne b(String str) {
        HashMap map = new HashMap();
        euzo euzoVar = this.d;
        AndroidPacketCreator androidPacketCreator = euzoVar.b;
        map.put("text_in", Packet.create(androidPacketCreator.nativeCreateString(androidPacketCreator.a.a(), str)));
        return (ejne) euzoVar.a(map);
    }

    @Override // defpackage.euzb
    public final void c(RuntimeException runtimeException) {
        ((ekrd) ((ekrd) ((ekrd) c.i()).g(runtimeException)).h("com/google/chat/smartmessaging/smartreply/android/models/mediapipe/TextClassifier", "onError", 207, "TextClassifier.java")).o();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        euzo euzoVar = this.d;
        euzoVar.c = this;
        euzoVar.close();
    }
}
