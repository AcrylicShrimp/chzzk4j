package xyz.r2turntrue.chzzk4j.types.channel.live;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ChzzkLiveChannel {

    private String channelId;
    private String channelName;
    private String channelImageUrl;
    private boolean verifiedMark;

    /**
     * Get id of the live channel.
     */
    public @NotNull String getId() {
        return channelId;
    }

    /**
     * Get name of the live channel.
     */
    public @NotNull String getName() {
        return channelName;
    }

    /**
     * Get image url of the live channel.
     */
    public @NotNull String getImageUrl() {
        return channelImageUrl;
    }

    /**
     * Get verified mark status of the live channel.
     */
    public boolean hasVerifiedMark() {
        return verifiedMark;
    }

    @Override
    public String toString() {
        return "ChzzkLiveChannelImpl{" +
                "channelId='" + channelId + '\'' +
                ", channelName='" + channelName + '\'' +
                ", channelImageUrl='" + channelImageUrl + '\'' +
                ", verifiedMark=" + verifiedMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChzzkLiveChannel that = (ChzzkLiveChannel) o;
        return verifiedMark == that.verifiedMark && Objects.equals(channelId, that.channelId) && Objects.equals(channelName, that.channelName) && Objects.equals(channelImageUrl, that.channelImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelName, channelImageUrl, verifiedMark);
    }
}
