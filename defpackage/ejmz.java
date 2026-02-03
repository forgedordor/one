package defpackage;

import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.ProtoUtil;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmz implements euzc {
    @Override // defpackage.euzc
    public final /* bridge */ /* synthetic */ euzm a(List list) throws evtj {
        try {
            Packet packet = (Packet) list.get(0);
            euyl euylVar = euyl.a;
            ProtoUtil.SerializedMessage serializedMessage = new ProtoUtil.SerializedMessage();
            PacketGetter.nativeGetProto(packet.getNativeHandle(), serializedMessage);
            int i = ProtoUtil.b;
            String strA = ProtoUtil.a(euylVar.getClass());
            if (!serializedMessage.typeName.equals(strA)) {
                throw new evtj("Message type does not match the expected type. Expected: " + strA + " Got: " + serializedMessage.typeName);
            }
            euyl euylVar2 = (euyl) euylVar.getParserForType().l(serializedMessage.value, evrr.a());
            ArrayList arrayList = new ArrayList();
            for (euyn euynVar : euylVar2.c) {
                euwv euwvVar = euynVar.c;
                if (euwvVar == null) {
                    euwvVar = euwv.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (euwt euwtVar : euwvVar.b) {
                    arrayList2.add(new euye(euwtVar.c, euwtVar.b, euwtVar.d, euwtVar.e));
                }
                arrayList.add(new euyg(DesugarCollections.unmodifiableList(arrayList2), euynVar.d, (euynVar.b & 4) != 0 ? Optional.of(euynVar.e) : Optional.empty()));
            }
            return new ejmw(new euyf(DesugarCollections.unmodifiableList(arrayList), (euylVar2.b & 1) != 0 ? Optional.of(Long.valueOf(euylVar2.d)) : Optional.empty()), ((Packet) list.get(0)).a());
        } catch (IOException e) {
            throw new MediaPipeException(euxa.INTERNAL.ordinal(), e.getMessage());
        }
    }

    @Override // defpackage.euzc
    public final /* bridge */ /* synthetic */ void b(List list) {
    }
}
