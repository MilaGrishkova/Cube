using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SoundEffector : MonoBehaviour
{
    public AudioSource audioSource;
    public AudioClip HitSound;
    public AudioClip FallSound;
    
    public void PlayHitSound()
    {
        audioSource.PlayOneShot(HitSound);
    }

     public void PlayFallSound()
    {
        audioSource.PlayOneShot(FallSound);
    }
}
