package defpackage;

import android.graphics.Bitmap;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eval implements euzc {
    final /* synthetic */ int a;
    final /* synthetic */ evan b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public eval(int i, evan evanVar, int i2, int i3) {
        this.a = i;
        this.b = evanVar;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.euzc
    public final /* synthetic */ euzm a(List list) {
        int i = this.a;
        Packet packet = (Packet) list.get(i);
        if (packet.nativeIsEmpty(packet.a)) {
            return evar.e(Optional.empty(), Optional.empty(), new ArrayList(), ((Packet) list.get(i)).a());
        }
        evag evagVar = (evag) this.b;
        evagVar.b.isPresent();
        boolean z = evagVar.a;
        Optional optionalEmpty = Optional.empty();
        if (z) {
            int i2 = this.c;
            int iNativeGetImageWidthFromImageList = PacketGetter.nativeGetImageWidthFromImageList(((Packet) list.get(i2)).getNativeHandle());
            int iNativeGetImageHeightFromImageList = PacketGetter.nativeGetImageHeightFromImageList(((Packet) list.get(i2)).getNativeHandle());
            Optional optionalOf = Optional.of(new ArrayList());
            int iNativeGetImageListSize = PacketGetter.nativeGetImageListSize(((Packet) list.get(i2)).getNativeHandle());
            ByteBuffer[] byteBufferArr = new ByteBuffer[iNativeGetImageListSize];
            for (int i3 = 0; i3 < iNativeGetImageListSize; i3++) {
                byteBufferArr[i3] = ByteBuffer.allocateDirect(iNativeGetImageWidthFromImageList * iNativeGetImageHeightFromImageList * 4);
            }
            if (!PacketGetter.nativeGetImageList(((Packet) list.get(i2)).getNativeHandle(), byteBufferArr, true)) {
                throw new MediaPipeException(euxa.INTERNAL.ordinal(), "There is an error getting confidence masks.");
            }
            for (int i4 = 0; i4 < iNativeGetImageListSize; i4++) {
                optionalOf.get().add(new euxl(new euxk(byteBufferArr[i4]), iNativeGetImageWidthFromImageList, iNativeGetImageHeightFromImageList));
            }
            optionalEmpty = optionalOf;
        }
        int i5 = this.d;
        Optional optionalEmpty2 = Optional.empty();
        float[] fArrNativeGetFloat32Vector = PacketGetter.nativeGetFloat32Vector(((Packet) list.get(i5)).getNativeHandle());
        ArrayList arrayList = new ArrayList(fArrNativeGetFloat32Vector.length);
        for (float f : fArrNativeGetFloat32Vector) {
            arrayList.add(Float.valueOf(f));
        }
        int i6 = evab.d;
        return evar.e(optionalEmpty, optionalEmpty2, arrayList, -1L);
    }

    @Override // defpackage.euzc
    public final /* bridge */ /* synthetic */ void b(List list) {
        Packet packet = (Packet) list.get(this.a);
        int iNativeGetImageWidth = PacketGetter.nativeGetImageWidth(packet.getNativeHandle());
        int iNativeGetImageHeight = PacketGetter.nativeGetImageHeight(packet.getNativeHandle());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iNativeGetImageWidth, iNativeGetImageHeight, Bitmap.Config.ARGB_8888);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iNativeGetImageWidth * iNativeGetImageHeight * 4);
        PacketGetter.nativeGetRgbaFromRgb(packet.getNativeHandle(), byteBufferAllocateDirect);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        euxg.a(bitmapCreateBitmap);
    }
}
