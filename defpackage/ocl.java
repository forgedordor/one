package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocl implements mce {
    final /* synthetic */ ocn a;
    private final oak b;

    public ocl(ocn ocnVar, oak oakVar) {
        this.a = ocnVar;
        this.b = oakVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    @Override // defpackage.mce
    public final void B(mcs mcsVar) {
        try {
            ?? B = mcsVar.b(1);
            int i = B;
            if (mcsVar.b(2)) {
                i = B + 1;
            }
            int i2 = 0;
            while (true) {
                ekgb ekgbVar = mcsVar.b;
                if (i2 >= ekgbVar.size()) {
                    break;
                }
                int iA = ((mcr) ekgbVar.get(i2)).a();
                if (iA != 1 && iA != 2) {
                    mff.f("ExoPlayerAssetLoader", a.g(iA, "Unsupported track type: "));
                }
                i2++;
            }
            if (i > 0) {
                this.b.c(i);
                this.a.c.e();
            } else {
                ocn ocnVar = this.a;
                this.b.b(new ocp("Asset loader error", new IllegalStateException(oeu.f(ocnVar.a, ocnVar.b.a) ? a.x("The asset loader has no audio or video track to output.", " Try setting an image duration on input image MediaItems.") : "The asset loader has no audio or video track to output."), 1001));
            }
        } catch (RuntimeException e) {
            this.b.b(new ocp("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.mce
    public final void p(mbz mbzVar) {
        String str;
        Throwable cause = mbzVar.getCause();
        if ((cause instanceof mrz) && ((mrz) cause).a == 1) {
            mff.d("ExoPlayerAssetLoader", "Releasing the player timed out.", mbzVar);
            return;
        }
        int i = mbzVar.a;
        ekfk ekfkVar = ocp.a;
        if (i == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i != 7001) {
            switch (i) {
                case 1000:
                    str = "ERROR_CODE_UNSPECIFIED";
                    break;
                case 1001:
                    str = "ERROR_CODE_REMOTE_ERROR";
                    break;
                case 1002:
                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    break;
                case 1003:
                    str = "ERROR_CODE_TIMEOUT";
                    break;
                case 1004:
                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    break;
                default:
                    switch (i) {
                        case 2000:
                            str = "ERROR_CODE_IO_UNSPECIFIED";
                            break;
                        case 2001:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            break;
                        case 2002:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            break;
                        case 2003:
                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            break;
                        case 2004:
                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            break;
                        case 2005:
                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                            break;
                        case 2006:
                            str = "ERROR_CODE_IO_NO_PERMISSION";
                            break;
                        case 2007:
                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            break;
                        case 2008:
                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    break;
                                case 3002:
                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    break;
                                case 3003:
                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    break;
                                case 3004:
                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                            break;
                                        case 4002:
                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                            break;
                                        case 4003:
                                            str = "ERROR_CODE_DECODING_FAILED";
                                            break;
                                        case 4004:
                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            break;
                                        case 4005:
                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            break;
                                        case 4006:
                                            str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 5001:
                                                    str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    break;
                                                case 5002:
                                                    str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    break;
                                                case 5003:
                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    break;
                                                case 5004:
                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 6000:
                                                            str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                            break;
                                                        case 6001:
                                                            str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            break;
                                                        case 6002:
                                                            str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            break;
                                                        case 6003:
                                                            str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            break;
                                                        case 6004:
                                                            str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            break;
                                                        case 6005:
                                                            str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            break;
                                                        case 6006:
                                                            str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            break;
                                                        case 6007:
                                                            str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            break;
                                                        case 6008:
                                                            str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            break;
                                                        default:
                                                            str = "invalid error code";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        Integer num = (Integer) ekfkVar.getOrDefault(str, 1000);
        mee.f(num);
        this.b.b(new ocp("Asset loader error", mbzVar, num.intValue()));
    }

    @Override // defpackage.mce
    public final void z(mcl mclVar, int i) {
        try {
            ocn ocnVar = this.a;
            if (ocnVar.d != 1) {
                return;
            }
            mck mckVar = new mck();
            mclVar.p(0, mckVar);
            if (mckVar.k) {
                return;
            }
            long j = mckVar.m;
            ocnVar.d = j > 0 ? 2 : 3;
            this.b.a(j);
        } catch (RuntimeException e) {
            this.b.b(new ocp("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.mce
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void A(mcq mcqVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void C(mde mdeVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void D(mcd mcdVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void a(mac macVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void c(mcc mccVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void d(mdw mdwVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void j(mbr mbrVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void k(mbt mbtVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void m(mca mcaVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void q(mbz mbzVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void i(mbo mboVar, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void t(mcf mcfVar, mcf mcfVar2, int i) {
    }
}
